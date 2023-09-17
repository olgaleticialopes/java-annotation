import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    String titular = scanner.next();
    int numeroConta = scanner.nextInt();
    double saldo = scanner.nextDouble();
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
  }
}

class ContaBancaria {
  protected int numero;
  protected String titular;
  protected double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println("Titular: " + titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
  }
}

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super(numero, titular, saldo); // Chama o construtor da classe base
    this.taxaJuros = taxaJuros;
  }

  @Override
  public void exibirInformacoes() {
    super.exibirInformacoes(); // Chama o método da classe base
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println("Taxa de Juros: " + decimalFormat.format(taxaJuros) + "%");
  }
}
