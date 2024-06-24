package Figuras;

public class principal {

    public static void Nome(Figuras figuras){

        figuras.forma("Circulo");

    }

    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado();

        Figuras circulo1 = new Circulo();

        System.out.println(quadrado1.forma("Quadrado"));
        System.out.println(quadrado1.area(10));
        System.out.println(quadrado1.perimetro(5.0));

       principal.Nome(circulo1);

       
    }

}
