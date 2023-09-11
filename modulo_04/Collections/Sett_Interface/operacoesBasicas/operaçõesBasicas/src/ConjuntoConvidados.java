import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // atributos

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicioanrConvidados(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidados(int codigoConvite) {
        Convidado convidadoRemover = null;

        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }

        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirListaConvidados() {
        for (Convidado c : convidadosSet) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) { 

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicioanrConvidados("mymy", 1);
        conjuntoConvidados.adicioanrConvidados("jonas", 2);
        conjuntoConvidados.adicioanrConvidados("caua", 3);
        conjuntoConvidados.adicioanrConvidados("leonardo", 4);
        conjuntoConvidados.adicioanrConvidados("julio", 5);
        conjuntoConvidados.adicioanrConvidados("leo", 4);


        conjuntoConvidados.removerConvidados(2);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirListaConvidados();

        //verifique que o convidado Leo não foi salvo pois possui o mesmo numero de convite que o leonardo
    }

}
