import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.println("Digite a quantidade de alunos da turma: ");
        int quantAlunos = input.nextInt();

        int counter = 1;
        while (counter <= quantAlunos){
            System.out.printf("Digite a nota 1 do %d° aluno: ", counter);
            nota1 = input.nextDouble();

            System.out.printf("Digite a nota 2 do  %d° aluno: ", counter);
            nota2 = input.nextDouble();

            System.out.printf("A média desse aluno foi: %.2f%n", (nota1 + nota2)/2.0);

            counter++; // counter = counter + 1;
        }
    }

}

