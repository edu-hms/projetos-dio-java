import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 937.48;

        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        numero = scanner.nextInt();
        
        System.out.println("");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agencia é: " + agencia + ", numero da conta: " + numero + ", e seu saldo de R$" + saldo + " já está disponivel para saque.");

    }
}
