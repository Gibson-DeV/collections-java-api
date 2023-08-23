package list.Ordenacao;

public class TesteOrdenacao {
    public static void main(String[] args) {
        OrdenacaoPessoa lista1 = new OrdenacaoPessoa();

        lista1.adicionarPessoa("Gibson",26,1.79);
        lista1.adicionarPessoa("Pedro",65,1.70);
        lista1.adicionarPessoa("Thamiriz",90,1.90);
        lista1.adicionarPessoa("Santos",10,1.72);

        System.out.println(lista1.ordenadoPorIdade());
        System.out.println(lista1.ordenarPorAltura());
    }
}
