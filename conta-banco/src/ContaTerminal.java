import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**TO DO: 
         * Conhecer e importar a classe Scanner
         * Exibir as mensagens para o nosso usuário
         * Obter pelo scanner os valores digitados no terminal
         * Exibir a mensagem conta criada
         * */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Boa tarde!\nPor favor, digite o número da sua agência:");
         int agencia = scanner.nextInt();

         System.out.println("Qual é o seu nome?");
         String nome = scanner.next();

         System.out.println("Qual é o número da sua conta?");
        int conta = scanner.nextInt();

        System.out.println("Qual é o seu saldo disponível?");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta+ " e seu saldo ");
        System.out.format("%.2f já está disponível para saque", saldo);

    }
}
