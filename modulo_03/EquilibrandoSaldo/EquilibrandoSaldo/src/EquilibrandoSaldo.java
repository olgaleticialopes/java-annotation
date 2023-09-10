

import java.text.DecimalFormat;
import java.util.Scanner;

 public class EquilibrandoSaldo {
    public static void main(String[] args) {
        
        
     Scanner scan = new Scanner(System.in);
     DecimalFormat deci = new DecimalFormat("0.0");
     
     double saldoAtual = scan.nextDouble();
     double valorDeposito = scan.nextDouble();
     double valorRetirada = scan.nextDouble();
     
     double saldoFinal = (saldoAtual + valorDeposito) - valorRetirada;
     
     System.out.println("Saldo atualizado na conta: "+deci.format(saldoFinal));
        
        
    }
    
}