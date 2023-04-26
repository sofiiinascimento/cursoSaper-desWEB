import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia do mês de hoje : ");
        int diaDoMes = input.nextInt();

        System.out.print("Digite o mês atual: ");
        int mesDigitado = input.nextInt();

        System.out.print("Digite o ano anual: ");
        int anoDigitado = input.nextInt();

        Data dataHoje = new Data(diaDoMes, mesDigitado, anoDigitado);

        System.out.print("Digite o dia do mês do seu aniversário: ");
        diaDoMes = input.nextInt();

        System.out.print("Digite o mês do seu aniver");
                System.out.print("Digite o mês do seu aniversário: ");
        mesDigitado = input.nextInt();

        System.out.print("Digite o ano que você nasceu: ");
        anoDigitado = input.nextInt();

        Data dataNiver = new Data(diaDoMes, mesDigitado, anoDigitado);

        System.out.print("Dia de hoje: \n");
        dataHoje.mostraData();

        System.out.print("Dia que você nasceu: \n");
        dataNiver.mostraData();
    }
}