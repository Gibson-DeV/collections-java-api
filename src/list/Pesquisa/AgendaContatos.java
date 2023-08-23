package list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato: contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String numero){
        Contato contatoAtualizado = null;
        for (Contato contato: contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTelefone(numero);
                break;
            }
        }
        return contatoAtualizado;
    }
}
