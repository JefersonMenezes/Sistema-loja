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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Cliente;
import modelo.Venda;

/**
 *
 * @author takedownone
 */
public class VendaDAO {

    private final Connection connection;

    public VendaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // inclui uma venda em seu respectivo cliente
    public void inserir(Venda venda) {
        String sql = "INSERT INTO venda (data_ven, valor_ven, id_cli) VALUES (?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, venda.getDataVenda());
            stmt.setDouble(2, venda.getValorVenda());
            stmt.setInt(3, venda.getCliente());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Altera uma venda pelo ID
    public void alterar(Venda venda) {
        String sql = "UPDATE venda SET valor_ven = ?, data_ven = ?, id_cli = ?,  WHERE id_ven = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setDouble(1, venda.getValorVenda());
            stmt.setDouble(2, venda.getValorVenda());
            stmt.setInt(3, venda.getCliente());
            stmt.setLong(4, venda.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    // Exclui uma venda pelo ID
    public void excluirPorId(Venda venda) {
        String sql = "DELETE FROM venda WHERE id_ven = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, venda.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // exclui uma venda pelo ID do cliente
    public void excluirPorCliente(Cliente cliente) {
        String sql = "DELETE FROM venda WHERE id_cli = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, cliente.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Lista todas as vendas do banco
    public List<Venda> listar(String nome) throws ParseException {
        String sql = "SELECT * FROM venda WHERE id_ven LIKE ?";
        try {
            List<Venda> vendas = new ArrayList<Venda>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, String.valueOf(nome));
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getLong("id_ven"));
                
                // transformando data
                String dataEmTexto = rs.getString("data_ven");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date data = sdf.parse(dataEmTexto);
                SimpleDateFormat sdfs = new SimpleDateFormat("dd-MM-yyyy");
                // passando a data transformada para string
                venda.setDataVenda(sdfs.format(data));
                
                venda.setValorVenda(rs.getDouble("valor_ven"));
                venda.setCliente(rs.getInt("id_cli"));

                vendas.add(venda);
            }
            rs.close();
            stmt.close();
            return vendas;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int buscarUltimaVenda() {
        String sql = "select * from venda";
        try {
            int retorno = 0;
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                retorno = rs.getInt("id_ven");
            }
            rs.close();
            stmt.close();
            return retorno;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Venda buscaCodigoValor() {
        String sql = "select * from venda";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Venda venda = new Venda();
            while (rs.next()) {
                venda.setId(rs.getLong("id_ven"));
                venda.setValorVenda(rs.getDouble("valor_ven"));
            }
            rs.close();
            stmt.close();
            return venda;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public double pegaSomaDasVendas() {
        String sql = "select sum(valor_ven) from venda";
        try {
            double total = 0;
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                total = rs.getDouble("sum(valor_ven)");
            }
            rs.close();
            stmt.close();
            return total;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public int totalVendaCliente(String nome) {
        String sql = "select count(id_ven) from venda where id_cli = ?";
        try {
            int total = 0;
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                total = rs.getInt("count(id_ven)");
            }
            rs.close();
            stmt.close();
            return total;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
