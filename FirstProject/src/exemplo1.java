import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = input.nextInt();

        if (num >= 0){
            System.out.println("O módulo de "+num+" é: "+num);
        } else {
            System.out.println("O módulo de "+num+" é: "+num*-1);
        }
    }
}
