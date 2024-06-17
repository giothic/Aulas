package estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pao extends Produto{

    public Pao(String nome, int quantidade, double valor) {
        super(nome, quantidade, valor);
        //TODO Auto-generated constructor stub
    }

    private String TipoPao;

    public String getTipoPao() {
        return TipoPao;
    }

    public void setTipoPao(String tipoPao) {
        TipoPao = tipoPao;
    }

    @Override
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");

        fabricacao.setDate(fabricacao.getDate() + 1);

        return fs.format(fabricacao);
    }

    


}
