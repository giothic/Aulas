package estoque;

import java.time.LocalDate;

public class Bolo extends Produto {

    private String sabor;

    public Bolo(String nome, int quantidade, double valor, String sabor, LocalDate fabricacao) {
        super(nome, quantidade, valor, fabricacao);

        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public LocalDate hoje(LocalDate hoje) {

        hoje = LocalDate.now();

        return hoje;
    }

    @Override
    public LocalDate data(LocalDate validade) {

        LocalDate fabricacao = getFabricacao();
        validade = fabricacao.plusDays(10);

        return validade;

    }

    @Override
    public LocalDate data2(LocalDate validadeA) {

        LocalDate fabricacao = getFabricacao();
        validadeA = fabricacao.plusDays(3);

        return validadeA;

    }

    @Override
    public String verificador(LocalDate hoje, LocalDate validade) {

        if (validade.isAfter(hoje(null))) {
            return "Produto vencido";
        } else {
            return "Produto na validade";
        }
    }

}
