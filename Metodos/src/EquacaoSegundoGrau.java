import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do coeficiente a: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor do coeficiente b: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor do coeficiente c: ");
        double c = input.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = (-b) / (2 * a);
            System.out.println("A equação possui uma única raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }

        input.close();
    }
}

