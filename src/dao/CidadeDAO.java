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
import modelo.Cidade;

/**
 *
 * @author takedownone
 */
public class CidadeDAO {

    private Connection connection;

    public CidadeDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // insere uma cidade no banco
    public void inserir(Cidade cidade) {
        String sql = "insert into cidade (nome_cid, sigla_uf) values (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cidade.getNome());
            stmt.setString(2, cidade.getSigla());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iserir cidade\n" + ex.getMessage());
        }

    }

    //altera uma cidade pelo ID
    public void alterar(Cidade cidade) {
        String sql = "UPDATE cidade SET nome_cid = ?, sigla_uf = ? where id_cid = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cidade.getNome());
            stmt.setString(2, cidade.getSigla());
            stmt.setLong(3, cidade.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    //exclui uma cidade pelo ID
    public void excluir(Cidade cidade) {
        String sql = "delete from cidade where id_cid = ?";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, cidade.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    //listar todas as cidades
    public List<Cidade> listar() {

        String sql = "SELECT * FROM cidade";
        try {
            List<Cidade> cidades = new ArrayList<Cidade>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(rs.getLong("id_cid"));
                cidade.setNome(rs.getString("nome_cid"));
                cidade.setSigla(rs.getString("sigla_uf"));

                cidades.add(cidade);
            }
            rs.close();
            stmt.close();
            return cidades;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int buscaPorNome(String nome) {
        String sql = "select * from cidade where nome_cid = '" + nome + "'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int id = 0;
            while (rs.next()) {
                id = rs.getInt("id_cid");
            }
            rs.close();
            stmt.close();
            return id;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
