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
import modelo.Parcela;

/**
 *
 * @author takedownone
 */
public class ParcelaDAO {

    private final Connection connection;

    public ParcelaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    // insere uma parcela no banco
    public void inserir(Parcela parcela) {
        String sql = "INSERT INTO parcela (data_venc, valor_parc, data_pgmt,"
                + " valor_pago, id_ven) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, parcela.getDataVencimento());
            stmt.setDouble(2, parcela.getValorParcela());
            stmt.setString(3, parcela.getDataPagamento());
            stmt.setDouble(4, parcela.getValorPago());
            stmt.setInt(5, parcela.getVenda());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // altera uma parcela no banco
    public void alterar(Parcela parcela) {
        String sql = "UPDATE parcela SET valor_parc = ?, data_pgmt= ?,"
                + "valor_pago = ?, id_ven = ?, data_venc= ? WHERE id_par = ? ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setDouble(1, parcela.getValorParcela());
            stmt.setString(2, parcela.getDataPagamento());
            stmt.setDouble(3, parcela.getValorPago());
            stmt.setInt(4, parcela.getVenda());
            stmt.setString(5, parcela.getDataVencimento());
            stmt.setLong(6, parcela.getId());

            stmt.execute();
            stmt.close();
            System.out.println("Parcela Alterada com sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public String trasformaDataUs(String dataEmTexto) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date data = sdf.parse(dataEmTexto);
        SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-yyyy");
        return sdfs.format(data);
    }

    public void alteraDataValor(Parcela parcela) {
        String sql = "UPDATE parcela SET data_venc = ?, valor_parc = ? WHERE id_ven = ? AND id_par = ? ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, parcela.getDataVencimento());
            stmt.setDouble(2, parcela.getValorParcela());
            stmt.setInt(3, parcela.getVenda());
            stmt.setLong(4, parcela.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // exclui uma parcela no banco pelo ID
    public void excluir(Parcela parcela) {

        String sql = "DELETE FROM parcela WHERE id_par = ? AND id_ven= ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setLong(1, parcela.getId());
            stmt.setInt(2, parcela.getVenda());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Parcela> listar() throws ParseException {
        String sql = "SELECT * FROM parcela";
        try {
            List<Parcela> parcelas = new ArrayList<Parcela>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setId(rs.getLong("id_par"));

                // transformando data de vencimento
                String dataVencSQL = rs.getString("data_venc");
                String dataVencPronta = trasformaDataBr(dataVencSQL);
                parcela.setDataVencimento(dataVencPronta);
                // trasformando data de Pagamento
                String dataPagSQL = rs.getString("data_pgmt");
                if (dataPagSQL != null) {
                    String dataPagPronta = trasformaDataBr(dataPagSQL);
                    parcela.setDataPagamento(dataPagPronta);
                } else {
                    parcela.setDataPagamento(dataPagSQL);
                }

                parcela.setValorParcela(rs.getDouble("valor_parc"));
                parcela.setValorPago(rs.getDouble("valor_pago"));
                parcela.setVenda(rs.getInt("id_ven"));

                parcelas.add(parcela);
            }

            rs.close();
            stmt.close();

            return parcelas;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public String trasformaDataBr(String dataEmTexto) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = sdf.parse(dataEmTexto);
        SimpleDateFormat sdfs = new SimpleDateFormat("dd-MM-yyyy");
        return sdfs.format(data);
    }

    public List<Parcela> listarPorVenda(String venda) throws ParseException {
        String sql = "SELECT * FROM parcela WHERE id_ven =" + venda + "";
        try {
            List<Parcela> parcelas = new ArrayList<Parcela>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setId(rs.getLong("id_par"));
                // transformando data de vencimento
                String dataVencSQL = rs.getString("data_venc");
                String dataVencPronta = trasformaDataBr(dataVencSQL);
                parcela.setDataVencimento(dataVencPronta);
               // trasforma data de Pagamento
                String dataPagSQL = rs.getString("data_pgmt");
                if (dataPagSQL != null) {
                    String dataPagPronta = trasformaDataBr(dataPagSQL);
                    parcela.setDataPagamento(dataPagPronta);
                } else {
                    parcela.setDataPagamento(dataPagSQL);
                }
                
                parcela.setValorParcela(rs.getDouble("valor_parc"));
                parcela.setValorPago(rs.getDouble("valor_pago"));
                parcela.setVenda(rs.getInt("id_ven"));

                parcelas.add(parcela);
            }

            rs.close();
            stmt.close();

            return parcelas;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

}
