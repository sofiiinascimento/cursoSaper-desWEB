import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos do vetor: ");
        int quant = input.nextInt();

        int[] vetor = new int[quant];

        for (int i=0; i < vetor.length; i++){
            if (i % 2 == 0){
                vetor[i] = 0;
            } else {
                vetor[i] = 1;
            }
        }

        for (int i=0; i < vetor.length; i++){
            System.out.printf("Elemento da posição %d do vetor: %d%n", i, vetor[i]);
        }
    }
}