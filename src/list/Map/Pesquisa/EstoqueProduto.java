package list.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo,String nome,int quantidade, double preco){
        estoqueProdutoMap.put(codigo, new Produto(nome,preco,quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorEstoque(){
        double valorEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto produto: estoqueProdutoMap.values()){
                valorEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorEstoque;
    }

}
