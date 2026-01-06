package br.com.lojageral;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto , int quantidade) {
        if (produto == null || quantidade <= 0){
            throw new IllegalArgumentException("Produto ou quantidade inválidos.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public double getSubtotal(){
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void adicionarQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
        }
    }
}
