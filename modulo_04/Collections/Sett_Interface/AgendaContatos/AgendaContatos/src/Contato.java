import java.util.Objects;

public class Contato {
    //atributos

    private String nome;

    private int numero;

    //construtor padrão

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    //getters e setters

    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
     this.numero = numero;
    }

    //equals 

    public boolean equals(Object c){
        if(this == c){
            return true;
        }
        if(!(c instanceof Contato contato)){
            return false;
        }

        return Objects.equals(getNome(), contato.getNome());
    }


    //toString
    @Override
    public String toString(){
        return "Nome: " + nome + " Número: " + numero + "\n";
    }

}
