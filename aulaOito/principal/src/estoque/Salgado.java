package estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Salgado extends Produto {

    private String recheio;

    public Salgado(String nome, int quantidade, double valor, String sabor, String recheio){
        super(nome, quantidade, valor);

        this.recheio = recheio;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 1);

        return fs.format(fabricacao);
    }


    @Override
    @SuppressWarnings("deprecation")
    public String data(Date validade){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validade.setDate(validade.getDate() + 1);

        return fs.format(validade);
    }

    @Override
    @SuppressWarnings("deprecation")
    public String data2(Date validadeA){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validadeA.setDate(validadeA.getDate() + 1);

        return fs.format(validadeA);

    }

}
