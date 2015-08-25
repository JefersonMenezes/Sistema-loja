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
import modelo.ProdutoVendido;

/**
 *
 * @author takedownone
 */
public class ProdutoVendidoDAO {

    private final Connection connection;

    public ProdutoVendidoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void inserir(ProdutoVendido vendido) {
        String sql = "INSERT INTO produto_vendido (id_ven, id_pro, qtde_ven)"
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, vendido.getVenda());
            stmt.setLong(2, vendido.getProduto());
            stmt.setInt(3, vendido.getQuantidade());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void alterarPelaVenda(ProdutoVendido vendido) {
        String sql = "UPDATE produto_vendido SET  id_pro = ?, qtde_ven = ? where id_ven = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, vendido.getProduto());
            stmt.setInt(2, vendido.getQuantidade());
            stmt.setLong(3, vendido.getVenda());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void alterarPeloProduto(ProdutoVendido vendido) {
        String sql = "UPDATE produto_vendido SET  id_ven = ?, qtde_ven = ? where id_pro= ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, vendido.getVenda());
            stmt.setInt(2, vendido.getQuantidade());
            stmt.setLong(3, vendido.getProduto());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void excluirPelaVenda(ProdutoVendido vendido) {
        String sql = "DELETE produto_vendido WHERE id_ven = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, vendido.getVenda());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void excluirPeloProduto(ProdutoVendido vendido) {
        String sql = "DELETE produto_vendido WHERE id_pro = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, vendido.getProduto());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<ProdutoVendido> listar() {
        String sql = "SELECT * FROM produto_vendido";
        try {
            List<ProdutoVendido> vendidos = new ArrayList<ProdutoVendido>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutoVendido vendido = new ProdutoVendido();
                vendido.setVenda(rs.getLong("id_ven"));
                vendido.setProduto(rs.getLong("id_pro"));
                vendido.setQuantidade(rs.getInt("qtde_ven"));

                vendidos.add(vendido);
            }
            rs.close();
            stmt.close();
            return vendidos;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

}
