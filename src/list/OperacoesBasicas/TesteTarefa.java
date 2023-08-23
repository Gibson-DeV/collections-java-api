package list.OperacoesBasicas;
 public class TesteTarefa {
     public static void main(String[] args) {

         ListaTarefa lista1 = new ListaTarefa();

        lista1.adicionarTarefa("Tarefa 01");
        lista1.adicionarTarefa("Tarefa 02");
        lista1.adicionarTarefa("Tarefa 03");
        lista1.adicionarTarefa("Tarefa 04");

        lista1.removerTarefa("Tarefa 03");

        System.out.println(lista1.obterNumeroTotalTarefas());

        lista1.obterDescricaoTarefas();

        ConjuntoConvidados conjuntoConvidados01 = new ConjuntoConvidados();

        conjuntoConvidados01.adicionarConvidado("Gibson",2023);
        conjuntoConvidados01.adicionarConvidado("Pedro",2025);
        conjuntoConvidados01.adicionarConvidado("Joao",2583);
        conjuntoConvidados01.adicionarConvidado("Ricardo",1996);

         System.out.println(conjuntoConvidados01.contarConvidados());

         conjuntoConvidados01.removerCandidatoPorCodigo(2583);
         conjuntoConvidados01.exibirConvidados();








     }
 }