/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author takedownone
 */
public class Parcela {
 
    private Long id;
    private String dataVencimento;
    private double valorParcela;
    private String dataPagamento;
    private double valorPago;
    private  int venda;

    public Parcela() {
    }

    public Parcela(Long id, String dataVencimento, double valorParcela, String dataPagamento, double valorPago, int venda) {
        this.id = id;
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.venda = venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    
    
    
    
}
