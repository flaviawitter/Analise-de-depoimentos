import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        depoimento depoimento = capturarDepoimento();

        classificacao classificacao = new classificacao();
        String resultado = classificacao.classificarDepoimento(depoimento.getTextoDepoimento());

        // Exibição do resultado
        System.out.println("Resultado da classificação: " + resultado);
    }

    // Método para capturar o depoimento
    public static depoimento capturarDepoimento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do depoente: ");
        String nomeDepoente = scanner.nextLine();

        System.out.println("Digite a data do depoimento: ");
        String dataDepoimento = scanner.nextLine();

        System.out.println("Digite o texto do depoimento: ");
        String textoDepoimento = scanner.nextLine();

        scanner.close();

        return new depoimento(nomeDepoente, dataDepoimento, textoDepoimento);
    }
}
