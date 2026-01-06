package br.com.lojageral;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto(
                "Mouse Sem Fio Logitech M170",
                "Mouse sem fio com conexão USB",
                89.90,
                1,
                10
        );

        Produto teclado = new Produto(
                "Teclado Mecânico Redragon Kumara",
                "Teclado mecânico com switches mecânicos",
                249.99,
                2,
                5
        );

        Produto headset = new Produto(
                "Headset Gamer HyperX Cloud Stinger",
                "Headset gamer com microfone",
                329.90,
                3,
                3
        );

        Produto monitor = new Produto(
                "Monitor LG 24 Full HD",
                "Monitor 24 polegadas Full HD",
                899.00,
                4,
                2
        );

        Produto webcam = new Produto(
                "webcam Logitech C920",
                "Webcam Full HD 1080p",
                499.90,
                5,
                1
        );

        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(mouse, 2);
        carrinho.adicionar(teclado, 1);
        carrinho.adicionar(headset, 1);
        carrinho.adicionar(monitor, 1);

        carrinho.adicionar(mouse, 1);
        carrinho.adicionar(webcam, 2);

        Venda venda = new Venda(carrinho);
        venda.finalizarVenda();


    }
}
