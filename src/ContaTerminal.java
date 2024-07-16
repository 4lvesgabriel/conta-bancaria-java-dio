import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Seu Banco! Por favor, digite o numero da conta:");
        int numConta = Integer.parseInt(scanner.nextLine()); // parse adicionado pra corrigir erro na hora  de receber as variaveis

        System.out.println("Digite a sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldoConta = Double.parseDouble(scanner.nextLine()); // parse adicionado pra corrigir erro na hora  de receber as variaveis

        System.out.println("Olá" + " " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é:" + " " + agencia + ", " + "conta" + " " + numConta + " " + "e seu saldo" + " " + saldoConta + " " + "Já  está disponível para saque.");
    
        scanner.close();
    }
}
