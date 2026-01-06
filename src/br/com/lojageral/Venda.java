package br.com.lojageral;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    private ArrayList<ItemCarrinho> itens;
    private LocalDateTime data;
    private double total;

    public Venda (Carrinho carrinho){
        this.itens = new ArrayList<>(carrinho.getItens());
        this.data = LocalDateTime.now();
        this.total = 0;
    }
    private boolean verificarEstoque(){
        for (ItemCarrinho item : itens){
            if (item.getProduto().getEstoque() < item.getQuantidade()){
                return false;
            }
        }
        return true;
    }

    public boolean finalizarVenda(){
        if (!verificarEstoque()){
            System.out.println("Venda não realizada: estoque insuficiente.");
            return false;
        }
        for (ItemCarrinho item : itens){
            item.getProduto().baixarEstoque(item.getQuantidade());
            total += item.getSubtotal();
        }
        System.out.println("Venda realizada com sucesso!");
        imprimirNotaFiscal();

        return true;
    }

    private void imprimirNotaFiscal(){
        System.out.println("\n----- NOTA FISCAL -----");

        for (ItemCarrinho item : itens){
            System.out.printf(
                    "%s | Qtd: %d | Subtotal: R$ %.2f%n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.getSubtotal()
            );
        }
        System.out.println("----------------------");
        System.out.printf("TOTAL: R$ %.2f%n", total);
        System.out.println("----------------------\n");
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getTotal() {
        return total;
    }
}
