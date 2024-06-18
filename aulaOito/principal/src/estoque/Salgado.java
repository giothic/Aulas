package estoque;

import java.time.LocalDate;

public class Salgado extends Produto {

    private String recheio;

    public Salgado(String nome, int quantidade, double valor, String recheio, LocalDate fabricacao) {
        super(nome, quantidade, valor, fabricacao);

        this.recheio = recheio;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public LocalDate hoje(LocalDate hoje) {

        hoje = LocalDate.now();

        return hoje;
    }

    @Override
    public LocalDate data(LocalDate validade) {

        LocalDate fabricacao = LocalDate.now();
        validade = fabricacao.plusDays(10);

        return validade;

    }

    @Override
    public LocalDate data2(LocalDate validadeA) {

        LocalDate fabricacao = LocalDate.now();
        validadeA = fabricacao.plusDays(3);

        return validadeA;

    }

    @Override
    public String verificador(LocalDate hoje, LocalDate validade) {

        if (validade.isAfter(hoje(hoje))) {
            return "Produto vencido";
        } else {
            return "Produto na validade";
        }
    }

}
