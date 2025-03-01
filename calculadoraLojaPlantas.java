import java.util.Scanner;

public class calculadoraLojaPlantas {
    //calcula o preço total
    public static double calcularPrecoTotal(int quantidade, double precoUnitario){
        return quantidade * precoUnitario;
    }

    //calcula o valor do troco
    public static double calcularTroco(double valorRecebido, double valorTotal){
        return valorRecebido - valorTotal;
    }

    // Menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Calcular Preço Total");
            System.out.println("2 - Calcular Troco");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite a quantidade de plantas:");
                    int quantidade = scanner.nextInt();
                    System.out.println("Digite o valor unitário:");
                    double precoUnitario = scanner.nextDouble();
                    double precoTotal = calcularPrecoTotal(quantidade , precoUnitario);
                    // Usando %.2f para exibir o preço total com 2 casas decimais
                    System.out.printf("O preço total é: %.2f\n", precoTotal);
                    break;

                case 2:
                    System.out.println("Digite o valor recebido: ");
                    double valorRecebido = scanner.nextDouble();
                    System.out.println("Digite o valor total: ");
                    double valorTotal = scanner.nextDouble();
                    double troco = calcularTroco(valorRecebido, valorTotal);
                    // Usando %.2f para exibir o troco com 2 casas decimais
                    System.out.printf("O valor de troco é: %.2f\n", troco);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(opcao != 3);
        
        scanner.close(); 
    }
}
