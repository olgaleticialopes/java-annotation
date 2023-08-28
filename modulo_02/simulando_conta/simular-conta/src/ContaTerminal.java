import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo ao banco");
        System.out.println("------------------");
        System.out.println("Digite 1 para criar uma conta");
        System.out.println("Digite 2 para sacar");
        System.out.println("Digite 3 para depositar");
        System.out.println("Digite 4 para transferir");
        System.out.println("Digite 5 para sair");
        int opcao = scanner.nextInt();
        MenuConta menuConta = new MenuConta();

        if (opcao == 1) {
            menuConta.CriarConta();
        } else if (opcao == 2) {
            menuConta.Sacar(opcao);
        } else if (opcao == 3) {
            menuConta.Depositar(opcao);
        } else if (opcao == 4) {
            menuConta.Transferir(opcao);
        } else if (opcao == 5) {
            System.out.println("Obrigado por utilizar nossos serviços");
        } else {
            System.out.println("Opção inválida");
        }
    }

}
