package estoque;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private int quantidade;
    private double valor;
    private LocalDate fabricacao;

    public Produto(String nome, int quantidade, double valor, LocalDate fabricacao) {

        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.fabricacao = fabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(LocalDate fabricacao) {
        this.fabricacao = fabricacao;
    }

    public LocalDate hoje(LocalDate hoje) {

        hoje = LocalDate.now();

        return hoje;
    }

    public LocalDate data(LocalDate validade) {

  
        validade = fabricacao.plusDays(10);

        return validade;

    }

    public LocalDate data2(LocalDate validadeA) {


        validadeA = fabricacao.plusDays(3);

        return validadeA;

    }

    public String verificador(LocalDate hoje, LocalDate validade) {

        if (validade.isAfter(hoje(hoje))) {
            return "Produto vencido";
        } else {
            return "Produto na validade";
        }
    }

}
