/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/**
 *
 * @author takedownone
 */
public class Venda {

    private Long id;
    private String dataVenda;
    private double valorVenda;
    private int cliente;
    

    public Venda() {
    }

    public Venda(Long id, String dataVenda, double valorVenda, int cliente) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.cliente = cliente;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
   public int getCliente(){ 
       return this.cliente;
   }
   
   public void setCliente (int cliente){
       this.cliente = cliente;
   }

    public void setDataVenda(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
