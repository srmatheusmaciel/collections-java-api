package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    };

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List <Item> removerItem = new ArrayList<>();

        for(Item item : itemList){
            if(item.getNome().equalsIgnoreCase(nome)){
                removerItem.add(item);
            }
        }
        itemList.removeAll(removerItem);
    }

    public int obterNumeroTotalItens(){

        return itemList.size();

    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.removerItem("Caderno");
        carrinhoDeCompras.obterNumeroTotalItens();
        carrinhoDeCompras.exibirItens();

    }


}
