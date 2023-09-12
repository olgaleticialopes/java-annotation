import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos 

    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
     public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
     }

     public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
     }

     public void exibirContatos(){
        System.out.println(agendaContatoMap);
     }

     public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return  numeroPorNome;
     }

     public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("mymy", 1);
        agendaContatos.adicionarContato("jonas", 2);
        agendaContatos.adicionarContato("joao", 3);
        agendaContatos.adicionarContato("carlos", 4);

        

        System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("joao"));

     }
}
