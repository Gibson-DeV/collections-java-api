package list.Pesquisa;

import list.OperacoesBasicas.ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAno(int anoInical, int anoFinal){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getAnoPublicacao() >= anoInical && livro.getAnoPublicacao() <= anoFinal ){
                    livrosPorIntervaloDeAno.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public Livro pesqusiarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
