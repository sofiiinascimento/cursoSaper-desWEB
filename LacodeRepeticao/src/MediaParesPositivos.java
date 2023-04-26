import java.util.Scanner;

public class MediaParesPositivos {
    public static void main (String[] args){
        int numeroDigitado;
        double soma=0;
        Scanner input = new Scanner(System.in);
        int contador = 0;

        do {
            System.out.print("Digite um número inteiro (DIGITE -1 PARA ENCERRAR!): ");
            numeroDigitado = input.nextInt();
            if (numeroDigitado > 0 && numeroDigitado %2 == 0){
                    System.out.println("O número digitado ENTRARÁ na média dos pares positivos");
                soma = soma + numeroDigitado;
            } else {
                System.out.println("O número digitado NÃO entratará na média dos pares positivos");
            }

        }while(numeroDigitado != -1);

        System.out.println("A soma dos pares positivos digitados é: "+soma);
        System.out.println();

    }
}
