package estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Peta extends Produto{

    private String tamanho;

    public Peta (String nome, int quantidade, double valor, String tamanho){
        super(nome, quantidade, valor);

        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }


    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

        @Override
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 30);

        return fs.format(fabricacao);
    }

    public double venda(int pacote){
        return pacote * 6.70;
    }

    public double venda(double quilo){
        return quilo * 15.45;
    }





}
