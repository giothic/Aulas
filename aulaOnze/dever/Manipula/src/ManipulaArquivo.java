import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulaArquivo {

    public static void leitura(String caminho) throws IOException{
        BufferedReader buff = new BufferedReader(new FileReader(caminho));
        String linha =  "";

        while ((linha = buff.readLine()) != null) {
            System.out.println(linha);
        }

        buff.close();

    }

    public static void escrita(String caminho) throws IOException {
        
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite dois números separados por espaço: ");
            String linha = scanner.nextLine();

            String[] numeros = linha.split(" ");

            int numero1 = Integer.parseInt(numeros[0]);
            int numero2 = Integer.parseInt(numeros[1]);

            int resultado = numero1 * numero2;

            String resultadoString = numero1 + " x " + numero2 + " = " + resultado;

            writer.write(resultadoString + "\n");

            writer.close();
            scanner.close();
    }
}
