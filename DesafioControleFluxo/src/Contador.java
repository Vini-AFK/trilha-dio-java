import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o valor do segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
        else{ 
            throw new ParametrosInvalidosException();
        }

    }
}
