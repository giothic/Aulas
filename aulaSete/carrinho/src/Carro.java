public class Carro {

    private String nome;
    private String modelo;
    private int qnt;
    private double potencia;


	public Carro(String nomeCarro, String modeloCarro, int qntRodas, double potenciaCarro){

        nome = nomeCarro;
        modelo = modeloCarro;
        qnt = qntRodas;
        potencia = potenciaCarro;

        
    }

    public String getCarro (){
        String info = "O carro é o " + nome + " do modelo " + modelo + ", com " + qnt + " rodas e tem uma potência de " + potencia + ".";
        return info;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

}

