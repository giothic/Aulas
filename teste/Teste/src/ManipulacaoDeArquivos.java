import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacaoDeArquivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois números separados por espaço: ");
        String numerosString = scanner.nextLine();

        scanner.close();

        // Separa os números da string de entrada
        String[] numeros = numerosString.split("\\s+");
        
        if (numeros.length != 2) {
            System.err.println("Formato inválido. Deve ser 'numero1 numero2'.");
            return;
        }

        try {
            // Converte os números de string para int
            int numero1 = Integer.parseInt(numeros[0]);
            int numero2 = Integer.parseInt(numeros[1]);

            // Calcula o resultado da multiplicação
            int resultado = numero1 * numero2;

            // Formata a string com o resultado
            String resultadoString = numero1 + " x " + numero2 + " = " + resultado;

            // Nome do arquivo de saída
            String nomeArquivo = "resultado.txt";

            // Chama o método para escrever no arquivo
            escrita(nomeArquivo, resultadoString);
            // System.out.println("Resultado escrito no arquivo " + nomeArquivo + " com sucesso!");

            // Chama o método para ler o arquivo e exibir seu conteúdo
            // System.out.println("\nConteúdo do arquivo:");
            // leitura(nomeArquivo);
        } catch (NumberFormatException e) {
            System.err.println("Erro: Certifique-se de digitar dois números válidos.");
        } catch (IOException e) {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }

    public static void leitura(String caminho) throws IOException {
        try (BufferedReader buff = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = buff.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }

    public static void escrita(String caminho, String conteudo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write(conteudo + "\n");
        }
    }
}




