public class Convidado{
    //atributos

    private String nome;
    private int codigoConvite;

    //construtor padrão
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //getters e setters

    public String getNome(){
        return nome;


    }

    public int getCodigoConvite(){
        return codigoConvite;
    }


    @Override
    public boolean equals(Object c){
       if(this == c){
           return true;
       }
       if(!(c instanceof Convidado convidado)){
              return false;
       }

       return getCodigoConvite() == convidado.getCodigoConvite();
    }
    
    @Override 
    public String toString(){
        return "Convidado: " + nome + " Código do convite: " + codigoConvite + "\n";
    }

}


