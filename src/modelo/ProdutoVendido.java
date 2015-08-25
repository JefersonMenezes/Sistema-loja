
package modelo;

/**
 *
 * @author takedownone
 */
public class ProdutoVendido {
    private Long venda;
    private Long produto;
    private int quantidade;

    public ProdutoVendido() {
    }

    public ProdutoVendido(Long venda, Long produto, int quantidade) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Long getVenda() {
        return venda;
    }

    public void setVenda(Long venda) {
        this.venda = venda;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
