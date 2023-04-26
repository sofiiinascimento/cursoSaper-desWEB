import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double num = input.nextDouble();

        if((num%2)==0){
            System.out.println("O número inserido é par");
        } else {
            System.out.println("O número inserido é ímpar");
        }

    }
}
