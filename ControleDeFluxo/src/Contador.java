import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primero número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try {
            Contador.contar(num1, num2);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    public static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero2 > numero1){
            int iter = numero2 - numero1;
            for (int i = 1; i <= iter; i++){
                System.out.printf("Imprimindo número %d\n", i);
            }
        } else if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } else {
            System.out.println(0);
        }
    }
}
