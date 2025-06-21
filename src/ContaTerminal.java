import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
