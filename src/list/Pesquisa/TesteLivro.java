package list.Pesquisa;

public class TesteLivro {
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros01 = new CatalogoLivros();

        catalogoLivros01.adicionarLivro("Livro01","Autor01",1996);
        catalogoLivros01.adicionarLivro("Livro02","Autor02",1997);
        catalogoLivros01.adicionarLivro("Livro01","Autor03",1998);
        catalogoLivros01.adicionarLivro("Livro03","Autor04",1999);
        catalogoLivros01.adicionarLivro("Livro04","Autor05",2000);

        System.out.println(catalogoLivros01.pesquisarPorAutor("Autor02"));
        System.out.println(catalogoLivros01.pesquisarPorAno(1996,1998));
        System.out.println(catalogoLivros01.pesqusiarPorTitulo("Livro01"));





    }
}
