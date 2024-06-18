package estoque;

import java.time.LocalDate;

public class Peta extends Produto {

    private String tamanho;

    public Peta(String nome, int quantidade, double valor, String tamanho, LocalDate fabricacao) {
        super(nome, quantidade, valor, fabricacao);

        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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

    public double venda(int pacote) {
        return pacote * 6.70;
    }

    public double venda(double quilo) {
        return quilo * 15.45;
    }

}
