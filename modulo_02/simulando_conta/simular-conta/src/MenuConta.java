import java.util.Scanner;
import java.util.Locale;

public class MenuConta {

    int saldo = 1000;

    public void CriarConta() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite a agencia");
        String agencia = scanner.next();

        System.out.println("Conta criada com sucesso");

    }

    public void Sacar(double saldo) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do saque");
        double valorSaque = scanner.nextDouble();

        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo é de: " + (saldo - valorSaque));
        }

    }

    public void Depositar(double saldo) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do deposito");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Deposito realizado com sucesso");
        System.out.println("Seu saldo é de: " + (saldo - valorDeposito));

    }

    public void Transferir(double saldo) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor da transferencia");
        double valorTransferencia = scanner.nextDouble();

        System.out.println("Digite o numero da conta de destino");
        int numeroContaDestino = scanner.nextInt();

        if (valorTransferencia > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo é de: " + (saldo - valorTransferencia));
        }
       
    }

    public void Sair() {
        System.out.println("Obrigado por utilizar nossos serviços");
    }
}
