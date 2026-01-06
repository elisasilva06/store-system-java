package br.com.lojageral;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCarrinho> itens;
    public Carrinho(){
        this.itens = new ArrayList<>();
    }
    public void adicionar(Produto produto , int quantidade){
        if(produto == null || quantidade <= 0){
            return;
        }

        if(produto.getEstoque() < quantidade){
            System.out.println("Estoque insuficiente para o produto: " + produto.getNome());
            return;
        }

        for (ItemCarrinho item : itens){
            if(item.getProduto().getId() == produto.getId()){
                item.adicionarQuantidade(quantidade);
                System.out.println("quantidade atualizada no carrinho.");
                return;
            }
        }
        ItemCarrinho novoItem = new ItemCarrinho(produto,quantidade);
        itens.add(novoItem);
        System.out.println("Produto adicionado ao carrinho.");
    }
    public void remover(int idProduto){
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().getId() == idProduto){
                itens.remove(i);
                System.out.println("Produto removido do carrinho.");
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public ArrayList<ItemCarrinho> getItens(){
        return itens;
    }

    public double getTotal(){
        double total = 0;

        for (ItemCarrinho item : itens){
            total += item.getSubtotal();
        }
        return total;
    }

    public void limpar(){
        itens.clear();
    }

}
