public class Caminhao extends Carro {

    public Caminhao(String nomeCarro, String modeloCarro, int qntRodas, int potenciaCarro) {
        super(nomeCarro, modeloCarro, qntRodas, potenciaCarro);
  
    }

    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }



}
