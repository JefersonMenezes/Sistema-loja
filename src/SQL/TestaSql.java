/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SQL;

import dao.ParcelaDAO;
import dao.VendaDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import modelo.Parcela;
import modelo.Venda;

/**
 *
 * @author takedown
 */
public class TestaSql {
    
    public static void main(String[] args) throws ParseException, SQLException {
        listarParcelaPorVenda();
    }
    
    static void listar() throws ParseException{
        VendaDAO dao  = new VendaDAO();
        List<Venda> vendas = dao.listar("2");
        
        for (Venda venda : vendas) {
            String a = venda.getDataVenda();
            System.out.println("Data :" + venda.getDataVenda());
            System.out.println("Cliente: " + venda.getCliente());
            System.out.println("ID: " + venda.getId());
            System.out.println("Valor " + venda.getValorVenda());
        }
    }

    private static void alteraParcela() throws ParseException {
        Parcela parcela = new Parcela();
        parcela.setId(Long.valueOf(5));
        parcela.setDataVencimento("2015/01/30");
        parcela.setValorParcela(55);
        parcela.setDataPagamento("2015/01/30");
        parcela.setValorPago(55);
        parcela.setVenda(4);
        ParcelaDAO dao = new ParcelaDAO();
        dao.alterar(parcela);
        
    }

    private Object ConnectionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static void listarParcela() throws ParseException{
        ParcelaDAO dao  = new ParcelaDAO();
        List<Parcela> parcelas = dao.listar();
        
        for (Parcela parcela : parcelas) {
            
            System.out.println("Codigo Prceela :" + parcela.getId());
            System.out.println("Data de Vencimento: " + parcela.getDataVencimento());
            System.out.println("Valor Parcela: " + parcela.getValorParcela());
            System.out.println("Data de Pagemento: " + parcela.getDataPagamento());
            System.out.println("Valor Pago: " + parcela.getVenda());
            
            System.out.println("-------------------------------------");
        }
    }
    
    static void listarParcelaPorVenda() throws ParseException{
        ParcelaDAO dao  = new ParcelaDAO();
        List<Parcela> parcelas = dao.listarPorVenda("4");
        
        for (Parcela parcela : parcelas) {
            
            System.out.println("Codigo Prceela :" + parcela.getId());
            System.out.println("Data de Vencimento: " + parcela.getDataVencimento());
            System.out.println("Valor Parcela: " + parcela.getValorParcela());
            System.out.println("Data de Pagemento: " + parcela.getDataPagamento());
            System.out.println("Valor Pago: " + parcela.getVenda());
            
            System.out.println("-------------------------------------");
        }
    }
}
