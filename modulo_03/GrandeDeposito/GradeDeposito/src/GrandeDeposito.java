import java.text.DecimalFormat;
import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double saldo = 0;
        double valor = scanner.nextDouble();
        double saldoAtualizado = saldo + valor;

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(saldoAtualizado));
        } else if (valor < 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
             System.out.println("Encerrando o programa.");
        }
    }
}