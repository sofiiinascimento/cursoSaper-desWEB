import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputStrings = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do cliente 1: ");
        Conta cliente = new Conta(inputStrings.nextLine());

        cliente.deposito(3000.00);
        cliente.saque(1000.00);
        cliente.deposito(2000.00);
        cliente.saque(500.00);

        System.out.println("Nome do cliente 1: " + cliente.getName());
        System.out.printf("Saldo do cliente 1: " + cliente.getSaldo());
    }
}