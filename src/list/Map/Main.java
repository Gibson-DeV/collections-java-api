package list.Map;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos01 = new AgendaContatos();

        agendaContatos01.adicionarContatos("Gibson", 12544);
        agendaContatos01.adicionarContatos("Pedro", 568963);
        agendaContatos01.adicionarContatos("Lara", 56547);
        agendaContatos01.adicionarContatos("Gibson", 9999);

        agendaContatos01.exibirContatos();
        agendaContatos01.removerContato("Lara");
        agendaContatos01.exibirContatos();

    }
}
