package estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bolo extends Produto{

    private String sabor;

    
    public Bolo(String nome, int quantidade, double valor, String sabor) {
        super(nome, quantidade, valor);
        
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

        @Override
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 3);

        return fs.format(fabricacao);
    }

    @Override
    @SuppressWarnings("deprecation")
    public String data(Date validade){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validade.setDate(validade.getDate() + 10);

        return fs.format(validade);

    }

    @Override
    @SuppressWarnings("deprecation")
    public String data2(Date validadeA){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        validadeA.setDate(validadeA.getDate() + 3);

        return fs.format(validadeA);

    }

}
