package seilaMan;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class AAAAAAAAA {

    public static void main(String[] args) {

        JTextField campoCEP = new JTextField(8);
        JTextField campoCPF = new JTextField(11);
        JTextField campoTelefone = new JTextField(11);
        String padraoCep = "#####-###";
        String padraoTelefone = "(##) #####-####";
        String padraoCpf = "###.###.###-##";

        Object[] mensagem = {
                "CEP:", campoCEP,
                "CPF:", campoCPF,
                "Telefone:", campoTelefone
        };

        int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Cadastro de Pessoa",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcao == JOptionPane.OK_OPTION) {
            String cep = campoCEP.getText();
            String cpf = campoCPF.getText();
            String telefone = campoTelefone.getText();

            if (cep.length() != 8 || cpf.length() != 11 || telefone.length() != 11) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente.");
                return; 
            }

            cep = FormataCep(cep, padraoCep);
            cpf = FormataCep(cpf, padraoCpf);
            telefone = FormataTelefone(telefone, padraoTelefone);

            String mensagemFinal = "Informações cadastradas:\n"
                    + "CEP: " + cep + "\n"
                    + "CPF: " + cpf + "\n"
                    + "Telefone: " + telefone;

            JOptionPane.showMessageDialog(null, mensagemFinal);
        }
    }

    static String FormataCep(String cep, String padraoCep) {
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padraoCep);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String FormataCpf(String cpf, String padraoCpf) {
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padraoCpf);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cpf);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String FormataTelefone(String telefone, String padraoTelefone) {
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padraoTelefone);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(telefone);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
