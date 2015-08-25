package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void inserir(Cliente cliente) {
        System.out.println("inserindo...");
        String sql = "INSERT INTO cliente (nome_cli, sexo_cli, telefone, idade, bairro, numero, email, cep, rua, id_cid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSexo());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getIdade());
            stmt.setString(5, cliente.getBairro());
            stmt.setInt(6, cliente.getCasa());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getCep());
            stmt.setString(9, cliente.getRua());

            stmt.setLong(10, cliente.getCidade());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void alterar(Cliente cliente) {

        String sql = "UPDATE cliente SET nome_cli = ?, sexo_cli= ?,telefone = ?,"
                + " idade = ?, bairro = ?, numero = ?, email = ?, cep = ?, rua = ?,"
                + " id_cid = ? WHERE id_cli = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSexo());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getIdade());
            stmt.setString(5, cliente.getBairro());
            stmt.setInt(6, cliente.getCasa());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getCep());
            stmt.setString(9, cliente.getRua());
            // seta o codigo da cidade
            stmt.setInt(10, cliente.getCidade());
            // onde o id for igual getId()
            stmt.setLong(11, cliente.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    //excluir um cliente pelo ID
    public void excluir(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE id_cli = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, cliente.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    //lista todos os clientes do banco
    public List<Cliente> listar(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome_cli LIKE ?";
        try {
            List<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getLong("id_cli"));
                cliente.setNome(rs.getString("nome_cli"));
                cliente.setSexo(rs.getString("sexo_cli"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCasa(rs.getInt("numero"));
                cliente.setCidade(rs.getInt("id_cid"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCep(rs.getString("cep"));
                cliente.setRua(rs.getString("rua"));
                clientes.add(cliente);
            }
            rs.close();
            stmt.close();
            return clientes;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public String pegaClientePorId(String id_cli) {
        String sql = "select * from cliente where id_cli = ?";
        try {
            String nomeCliente = null;
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, id_cli);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                nomeCliente = rs.getString("nome_cli");
            }
            rs.close();
            stmt.close();
            return nomeCliente;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
