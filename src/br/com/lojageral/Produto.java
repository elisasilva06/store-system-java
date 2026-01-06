package br.com.lojageral;

public class Produto {
    private String nome;
    private int id;
    private int estoque;
    private String descricao;
    private double preco;




    public Produto(){}

    public Produto(String nome , String descricao , double preco , int id , int estoque){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.id = id;
        this.estoque = estoque;
    }

    public boolean baixarEstoque (int quantidade){
        if (quantidade <= 0) {
            return false;
        }
        if(this.estoque >= quantidade){
            this.estoque -= quantidade;
            return true;
        } else{
            return false;
        }
    }

    public void reporEstoque(int quantidade){
        if (quantidade > 0){
            this.estoque += quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
