import java.util.Scanner;

public class AbrincoContas {

    public static void main(String[] args) {

        // Lendo os dados de Entrada:
        Scanner scan = new Scanner(System.in);
        int numeroConta = scan.nextInt();
        scan.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scan.nextLine();
        double saldo = scan.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(numeroConta,nomeTitular,saldo);
        
        System.out.println(conta);

       
    }

}

class ContaBancaria {

    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Informacoes:"+ 
                "\nConta: " + numero + 
                "\nTitular: " + titular + 
                "\nSaldo: R$ " + saldo;
    }
    
    
    
}