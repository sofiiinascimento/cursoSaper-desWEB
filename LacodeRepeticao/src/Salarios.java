import java.util.Scanner;

public class Salarios {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double salario, gasto = 0;

        int i = 0;

        while (i < 3) {
            System.out.printf("Digite o salário %d° funcionario: ", i+1);
            salario = input.nextDouble();
            
            gasto = gasto + salario;

            i++;
        }
        
        System.out.println("O gasto da empresa com os funcionários é de R$"+gasto);
        System.out.println("A média salarial da empresa é de R$"+gasto/3.0);
    }
}
