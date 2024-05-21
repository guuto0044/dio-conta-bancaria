import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        

        System.out.println("Informe o número de conta:");
        int numero = scanner.nextInt();

        System.out.println("Informe o os digitos da agência:");
        String agencia = scanner.next();

        System.out.println("Informe o nome do Cliente:");
        String nome = scanner.next();

        System.out.println("Informe seu saldo atual:");
        Double salado = scanner.nextDouble();

        System.out.println("-----------------------");

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência: " + agencia);
        System.out.println("Sua Conta:" + numero);
        System.out.println("Seu Salado Disponivél:" + salado);

    }
}
