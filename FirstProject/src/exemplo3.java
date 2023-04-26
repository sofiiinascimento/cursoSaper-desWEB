import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o salário do vendedor: ");
        double salario = input.nextDouble();

        System.out.println("Insira o total das vendas dele: ");
        double vendas = input.nextDouble();

        if(salario < 1500 && vendas > 2000){
            double novoSalario = salario * 1.1;
            System.out.printf("O novo salário dele é: R$%.2f",novoSalario);
        } else{
            System.out.println("Ele não teve nenhum aumento.");
        }
    }

}
