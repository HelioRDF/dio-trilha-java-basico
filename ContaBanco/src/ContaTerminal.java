import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consome o '\n' que fica após o nextInt()

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo  R$ %.2f%n já está disponível para saque",
                nomeCliente, agencia, numero, saldo);

        scanner.close();

    }

}
