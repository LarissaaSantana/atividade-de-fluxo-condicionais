import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println("informe o numero 1");
        int numero1 = leia.nextInt();

        System.out.println("informe o numero 2");
        int numero2 = leia.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(numero1, numero2);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception);       }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
             throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i< contagem; i++){
            System.out.println("Imprimindo numero" + i);
        }
    }
}


