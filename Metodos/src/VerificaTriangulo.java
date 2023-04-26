import java.util.Scanner;

public class VerificaTriangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = input.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = input.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os valores informados podem formar um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo formado é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo formado é isósceles.");
            } else {
                System.out.println("O triângulo formado é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        input.close();
    }
}

