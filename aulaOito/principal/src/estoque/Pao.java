package estoque;

import java.time.LocalDate;

public class Pao extends Produto {

    public Pao(String nome, int quantidade, double valor, LocalDate fabricacao) {
        super(nome, quantidade, valor, fabricacao);

    }

    private String TipoPao;

    public String getTipoPao() {
        return TipoPao;
    }

    public void setTipoPao(String tipoPao) {
        TipoPao = tipoPao;
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
