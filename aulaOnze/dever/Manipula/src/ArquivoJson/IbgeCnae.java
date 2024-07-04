package ArquivoJson;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import java.io.StringWriter;

public class IbgeCnae {

    public static void main(String[] args) {

        JsonObject address = Json.createObjectBuilder()
                .add("rua", "Rua das Flores")
                .add("cidade", "São Paulo")
                .add("estado", "SP")
                .build();

        JsonArray hobbies = Json.createArrayBuilder()
                .add("Leitura")
                .add("Fotografia")
                .build();

        JsonObject person = Json.createObjectBuilder()
                .add("nome", "Maria")
                .add("idade", 30)
                .add("casado", false)
                .add("endereco", address)
                .add("hobbies", hobbies)
                .build();


        StringWriter stringWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stringWriter)) {
            jsonWriter.writeObject(person);
        }

        String jsonString = stringWriter.toString();
        System.out.println(jsonString);
    }
}

