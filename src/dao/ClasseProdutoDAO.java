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
import modelo.ClasseProduto;

/**
 *
 * @author takedownone
 */
public class ClasseProdutoDAO {

    private final Connection connection;

    // connection recebe uma conexao atraves do construtor
    public ClasseProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // insere uma classe de produtos no banco
    public void inserir(ClasseProduto classe) {
        String sql = "INSERT INTO classe (nome_cla) VALUES (?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, classe.getNome());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // altera uma classe de produtos no banco
    public void alterar(ClasseProduto classe) {
        String sql = "UPDATE classe SET nome_cla=? WHERE id_cla = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, classe.getNome());
            stmt.setLong(2, classe.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Tipo de Produto alterado com sucesso!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    // exclui uma classe de produto
    public void excluir (ClasseProduto classe) {
        String sql = "DELETE FROM classe WHERE id_cla = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setLong(1, classe.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Tipo de Produto excluido com sucesso!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    // listar todas as classes do banco
    public List<ClasseProduto> listar() {
        String sql = "SELECT * FROM classe";
        try {
            List<ClasseProduto> classes = new ArrayList<ClasseProduto>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClasseProduto classe = new ClasseProduto();

                classe.setId(rs.getLong("id_cla"));
                classe.setNome(rs.getString("nome_cla"));

                classes.add(classe);
            }
            rs.close();
            stmt.close();

            return classes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
      public int  buscaPorNome(String nome) {
        String sql = "select * from classe where nome_cla = '"+nome+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int id = 0 ;
            while (rs.next()){
            id = rs.getInt("id_cla");  
            }
            
            return id;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    

}
