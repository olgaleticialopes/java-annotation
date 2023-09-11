import java.util.Comparator;

public class Pessoa  implements Comparable <Pessoa>{
     
    @Override
    public int compareTo(Pessoa p) {
        // TODO Auto-generated method stub
        return Integer.compare(idade, p.getIdade());

    }

    //atributos

    private String nome ;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    //toString

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + " anos" +
                ", altura=" + altura + " m" +
                '}';
    }

}

class ComparatorPorAltura implements Comparator <Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    

}
