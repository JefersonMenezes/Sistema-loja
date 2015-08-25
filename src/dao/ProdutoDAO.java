/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Produto;

/**
 *
 * @author takedownone
 */
public class ProdutoDAO {

    private final Connection connection;

    // construtor 
    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // insere um produto no banco
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (desc_pro, valor_pro, qtde_pro,id_cla,nome) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getValorProduto());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getClasse());
            stmt.setString(5, produto.getNome());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // altera um produto pelo ID
    public void alterar(Produto produto) {
        String sql = "UPDATE produto SET  desc_pro = ?, valor_pro = ?, qtde_pro = ?, id_cla = ?, nome = ?  WHERE id_pro = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getValorProduto());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getClasse());
            stmt.setString(5, produto.getNome());
            stmt.setLong(6, produto.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    // exclui um produto do banco pelo ID
    public void excluir(Produto produto) {
        String sql = "DELETE FROM produto WHERE id_pro = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, produto.getId());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    
    // lista todos os produtos do banco
    public List<Produto> listar(String nome) {
        String sql = "SELECT * FROM produto WHERE nome LIKE ?";
        try {
            List<Produto> produtos = new ArrayList<Produto>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getLong("id_pro"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("desc_pro"));
                produto.setValorProduto(rs.getDouble("valor_pro"));
                produto.setQuantidade(rs.getInt("qtde_pro"));
                produto.setClasse(rs.getInt("id_cla"));
                
                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            return produtos;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void alteraQuantidade(Produto produto) {
        String sql = "UPDATE produto SET qtde_pro = ? where id_pro = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, produto.getQuantidade());
            stmt.setLong(2, produto.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
