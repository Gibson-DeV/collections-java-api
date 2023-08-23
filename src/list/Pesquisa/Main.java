package list.Pesquisa;

public class Main {
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

        AgendaContatos agendaContatos01 = new AgendaContatos();

        agendaContatos01.adicionarContato("Luana Cavalcante","2262-5685");
        agendaContatos01.adicionarContato("Gibson Cruz","56523-5445");
        agendaContatos01.adicionarContato("Pedro Jose","2262-9566");
        agendaContatos01.adicionarContato("El Cabron","9568-56589");

        agendaContatos01.exibirContatos();
        agendaContatos01.atualizarNumeroContato("Gibson Cruz","12345-45678");
        System.out.println(agendaContatos01.pesquisarPorNome("Gibson"));






    }
}
