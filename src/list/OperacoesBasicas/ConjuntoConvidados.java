package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome,codigoConvidado));
    }

    public void removerCandidatoPorCodigo(int codigoConvidado){
            Convidado convidadoParaRemover = null;
            for (Convidado convidado: convidadoSet){
                if (convidado.getCodigoConvite() == codigoConvidado){
                    convidadoParaRemover = convidado;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
