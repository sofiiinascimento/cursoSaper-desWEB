import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1= input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();

        double multi = n1 * n2;

        System.out.println("Resultado da multiplicação dos dois números: "+multi);

        if (multi < 25 || multi >50 ){
            System.out.println("Metade do resultado da multiplicação: "+multi/2.0);
        }
    }
}