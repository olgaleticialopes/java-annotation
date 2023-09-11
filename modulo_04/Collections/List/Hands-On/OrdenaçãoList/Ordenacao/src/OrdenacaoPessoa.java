import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // atributos

    private List<Pessoa> pessoaList;

    // construtor
    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>();
    }

    // metodos

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

   
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(null);
        ordenacaoPessoa.adicionarPessoa("Nome 1", 28, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 35, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.pessoaList);
    }

}
