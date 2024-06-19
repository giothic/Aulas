package Automovel;
class App {

    public static void ligarMotor(Veiculo veiculo){
        veiculo.ligar();
    }
    public static void main(String[] args) throws Exception {
     
        Veiculo corsa = new Carro();

        App.ligarMotor(corsa);
    }
}
