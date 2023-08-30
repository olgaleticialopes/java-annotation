import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisando candidatos;
        System.out.println("Processo Seletivo...");
        String[] candidados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for(String candidado: candidados){
            entrandoEmContato(candidado);
        }

    }

    static void entrandoEmContato(String candidado){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            //em algum momento o candidato atendeu
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("\nContato realizado com sucesso!");

        }while(continuarTentando && tentativasRealizadas < 3);
       if (atendeu){
			System.out.println("Conseguimos contado com: " + candidado +" na " + tentativasRealizadas + " tentativa");
       }else{
			System.out.println("\nNÃO conseguimos contato com: " + candidado +", número maximo de tentativas: " + tentativasRealizadas + " realizadas");}
		

    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void selecaoCanditados() {
        ///selecionar candidatos
        // Array com a lista de candidatos
        double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int totalSelecionados = 0;
		int proximoCandidato = 0; 
		while(totalSelecionados <5 && proximoCandidato < candidatos.length)//length é o tamanho do array)
        {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.printf(" \nO  candidato " + candidato + " pretende ganhar " + "%.2f",valorPretendido);
            //"%2f" formata o numero de casas apos a virgula para 2.

			if(valorPretendido > salarioBase) {
				System.out.println("\n O candidato(a) " + candidato + " NÃO foi selecionado(a) ");
				
			}else {
				System.out.println("\nO candidato(a) " + candidato + " foi selecionado(a) ");
				totalSelecionados++;
			}
			
		}

		System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);
	}

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        System.out.println("Analisando candidato(a)...");
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditado(a)!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o canditado(a) com contra proposta!");
        } else {
            System.out.println("Aguardando os resultados dos candidatos!");
        }

    }

    static void imprimirSelecionados() {

        System.out.println("Imprimindo selecionados...");
        String[] candidados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
                System.out.println("Imprimindo selecionados pelo indice...");
        for (int i = 0; i < candidados.length; i++) {
            System.out.println((i+1)+ "° Candidato é " + candidados [i] );
    }
}



}
