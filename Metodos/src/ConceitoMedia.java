import java.util.Scanner;

public class ConceitoMedia {
     public static void main(String[] args){

         Scanner inpuDoubles = new Scanner(System.in);
         Scanner inputStrings = new Scanner(System.in);

         System.out.println("Digite o nome do primeiro aluno: ");
         String nomeAluno = inputStrings.nextLine();

         System.out.println("Digite a media desse aluno");
         double mediaAluno = inpuDoubles.nextDouble();

         Aluno estudante1 = new Aluno(nomeAluno, mediaAluno);

         System.out.println("Digite o nome do segundo aluno: ");
         nomeAluno = inputStrings.nextLine();

         System.out.println("Digite a media desse aluno");
         mediaAluno = inpuDoubles.nextDouble();

         Aluno estudante2 = new Aluno(nomeAluno, mediaAluno);

         System.out.println("Conceitos: ");
         System.out.println("Conceito do primeiro aluno: "+estudante1.conceito());
         System.out.println("Conceito do segundo aluno: "+estudante2.conceito());
     }
}
