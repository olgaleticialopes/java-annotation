import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    // atributos

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public void removerContatos(String nome) {
        Contato contatoRemover = null;

        for (Contato c : contatosSet) {
            if (c.getNome().equals(nome)) {
                contatoRemover = c;
                break;
            }
        }

        contatosSet.remove(contatoRemover);
    }

     public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("João", 123456789);
         agendaContatos.adicionarContatos("João", 0);
          agendaContatos.adicionarContatos("João Pedro", 12456);
          agendaContatos.adicionarContatos("mymy", 12456910);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("João"));

        System.out.println(agendaContatos.atualizarNumeroContato("João", 40028922));

        System.out.println(agendaContatos.pesquisarPorNome("João"));
        
        
    }
}