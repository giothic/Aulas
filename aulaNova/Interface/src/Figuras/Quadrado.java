package Figuras;

public class Quadrado implements Figuras {

    public int lado(int lado){
        return lado;
    }

    public String forma(String forma){
        return forma;
    }

    public String area(int lado, int area){
        area = lado ^ 2;
        System.out.println("A area do quadrado é de: " + area);
        return null;
    }

        public double perimetro(double perimetro, int lado){
            perimetro = lado * 4;
            return perimetro;
        }

}
