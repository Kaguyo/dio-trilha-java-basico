import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine().toUpperCase();
        
        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine().toUpperCase();
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        // Formatando e exibindo a mensagem
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, CONTA %d e seu saldo %.2f já está disponível para saque.",
                                        nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
}
