import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite o número da conta ");
        int conta = scanner.nextInt();

        System.out.println("Digite a agemcia ");
        String agencia = scanner.next();

        System.out.println("Adicionar Saldo ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá ".concat(nome) + " , obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)
                        + " , conta " + conta + "e seu saldo " + saldo + " já está disponível para saque");

    }
}
