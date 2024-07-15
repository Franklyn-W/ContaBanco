import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número da conta");
        int numConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o número da agencia");
        String numAgencia = scan.nextLine();

        System.out.println("Informe o nome do cliente");
        String nomeCliente = scan.nextLine();

        System.out.println("Informe o saldo");
        float saldo = scan.nextFloat();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numAgencia, numConta, saldo);

        scan.close();

    }
}
