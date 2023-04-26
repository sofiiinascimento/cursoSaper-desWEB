import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeVendedores;
        System.out.print("Digite a quantidade de vendedores da loja: ");
        quantidadeVendedores = input.nextInt();

        double valorVendas;
        double totalVendasLoja = 0;
        double maiorVenda = 0;

        for (int i=0; i < quantidadeVendedores; i++){
            System.out.printf("Digite o valor das vendas do %dº vendedor(a):%n", i+1);
            valorVendas = input.nextDouble();
            totalVendasLoja += valorVendas;

            maiorVenda = valorVendas;

            if (valorVendas > maiorVenda){
                maiorVenda = valorVendas;
            }
        }

        System.out.printf("Valor total de vendas da loja: %.2f%n", totalVendasLoja);
        System.out.printf("Média de vendas dos vendedores: %.2f%n", totalVendasLoja/quantidadeVendedores);
        System.out.printf("Maior valor de vendas entre os vendedores: %.2f", maiorVenda);
    }
        }
    }
}