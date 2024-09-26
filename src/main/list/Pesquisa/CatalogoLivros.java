package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List <Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adcionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao ));

    }


    public List<Livro> pequisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }

            }



        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break; //Pra parar o laço porque só precisa o primeiro livro que aparecer
                }
            }
        }

        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adcionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adcionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adcionarLivro("Livro 2", "Autor 1", 2022);
        catalogoLivros.adcionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adcionarLivro("Livro 4", "Autor 4", 1970);
        System.out.println(catalogoLivros.pequisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }

}
