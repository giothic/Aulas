package ArquivoJson;

import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings({ "unchecked", "deprecation" })
public class EscritaJson {
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {

        JSONObject jsonObject = new JSONObject();
        JSONParser parse = new JSONParser();

        try {
            jsonObject = (JSONObject) parse.parse(new FileReader("saida.json"));
            // if (obj != null) {
            //     jsonObject = (JSONObject) obj;
            // }

        } catch (FileNotFoundException e) {
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String continuar;
        do {
            JSONObject novoRegistro = new JSONObject();

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            novoRegistro.put("Nome", nome);

            System.out.print("Digite o sobrenome: ");
            String sobrenome = scanner.nextLine();
            novoRegistro.put("Sobrenome", sobrenome);

            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();
            novoRegistro.put("Cidade", cidade);

            System.out.print("Digite o estado: ");
            String estado = scanner.nextLine();
            novoRegistro.put("Estado", estado);

            jsonObject.put(nome.toLowerCase(), novoRegistro);

            System.out.print("Deseja adicionar outro registro? (S/N): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        scanner.close();

        try (FileWriter escreve = new FileWriter("saida.json")) {
            escreve.write(jsonObject.toJSONString());
            System.out.println("Registros escritos no arquivo 'saida.json'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
