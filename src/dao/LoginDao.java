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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import modelo.Login;

/**
 *
 * @author takedown
 */
public class LoginDao {

    private final Connection connection;

    public LoginDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // inclui uma venda em seu respectivo cliente
    public void inserir(Login login) {
        String sql = "INSERT INTO login (nome, senha) VALUES (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Altera uma venda pelo ID
    public void alterar(Login login) {
        String sql = "UPDATE login SET nome = ?, senha = ?  WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());
            stmt.setInt(3, login.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    // Exclui uma venda pelo ID
    public void excluirPorId(int id) {
        String sql = "DELETE FROM login WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, id);

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Lista todas as vendas do banco
    public List<Login> listarPorNome(String nome) throws ParseException {
        String sql = "SELECT * FROM login WHERE nome LIKE ?";
        try {
            List<Login> logins = new ArrayList<Login>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Login login = new Login();
                login.setId(rs.getInt("id"));
                login.setUsuario(rs.getString("nome"));
                login.setSenha(rs.getString("senha"));

                logins.add(login);
            }
            rs.close();
            stmt.close();
            return logins;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Login buscarUsuario(String nome, String senha) {
        String sql = "SELECT nome, senha FROM login WHERE nome = ? AND senha = ?";
        try {
            Login login = new Login();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                login.setUsuario(rs.getString("nome"));
                login.setSenha(rs.getString("senha"));
            }
            rs.close();
            stmt.close();
            return login;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public List<Login> listar() {
        String sql = "SELECT * FROM login";
        try {
            List<Login> logins = new ArrayList<Login>();
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Login login = new Login();
                login.setId(rs.getInt("id"));
                login.setUsuario(rs.getString("nome"));
                login.setSenha(rs.getString("senha"));

                logins.add(login);
            }
            rs.close();
            stmt.close();
            return logins;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
