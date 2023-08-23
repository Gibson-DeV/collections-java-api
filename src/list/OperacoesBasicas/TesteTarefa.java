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





     }
 }