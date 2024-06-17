package estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String nome, int quantidade, double valor){

        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
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

    
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 1);

        return fs.format(fabricacao);
    }

    @SuppressWarnings("deprecation")
    public String data(Date validade){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validade.setDate(validade.getDate() + 1);

        return fs.format(validade);
    }

    @SuppressWarnings("deprecation")
    public String data2(Date validadeA){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validadeA.setDate(validadeA.getDate() + 1);

        return fs.format(validadeA);
    }
    

}
