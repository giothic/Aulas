import java.text.ParseException;


import javax.swing.text.MaskFormatter;


public class App {
    public static void main(String[] args) throws Exception {

        String padrao = "#####-###";
        String cep = "37493846";
        System.out.println(FormataCep(cep, padrao));
        // try {
        // String cep = FormataCep("123234467");
        // System.out.println(cep);
        // } catch (CepInvalido e) {
        // System.err.println(e.getMessage());
        // }

    }

    static String FormataCep(String cep, String padrao) {
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padrao);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // if (cep.length() > 8){
        // throw new CepInvalido("A quantidade de caracteres é maior que 8.");
        // }else if(cep.length() < 8 ){
        // throw new CepInvalido("A quantidade de caracteres é menor que 8.");
        // }
        // return "12323-446";

    }
}
