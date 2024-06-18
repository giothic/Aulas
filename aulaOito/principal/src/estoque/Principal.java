package estoque;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo("Bolo de Chocolate", 0, 0, "Chocolate", LocalDate.of(2024, 6, 11));
        Pao pao1 = new Pao("Pão Francês", 10, 0.50, LocalDate.of(2024, 6, 17));
        Pao pao2 = new Pao("Pão Doce", 8, 0.80, LocalDate.of(2024, 6, 17));
        Pao pao3 = new Pao("Pão Careca", 5, 0.30, LocalDate.of(2024, 6, 17));


        System.out.println("Produto: " + bolo1.getNome());
        System.out.println("Fabricação: " + bolo1.getFabricacao());
        System.out.println("Validade: " + bolo1.data(null));
        System.out.println("Validade depois de aberto: " + bolo1.data2(null));
        System.out.println(bolo1.verificador(bolo1.hoje(null), bolo1.getFabricacao()));

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("Produto: " + pao1.getNome());
        System.out.println("Fabricação: " + pao1.getFabricacao());
        System.out.println("Fabricação: " + pao1.getFabricacao());
        System.out.println("Validade: " + pao1.data(null));
        System.out.println("Validade depois de aberto: " + pao1.data2(null));
        pao1.verificador(pao1.hoje(null), pao1.getFabricacao());

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("Produto: " + pao2.getNome());
        System.out.println("Fabricação: " + pao2.getFabricacao());
        System.out.println("Fabricação: " + pao2.getFabricacao());
        System.out.println("Validade: " + pao2.data(null));
        System.out.println("Validade depois de aberto: " + pao2.data2(null));
        pao2.verificador(pao2.hoje(null), pao2.getFabricacao());

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("Produto: " + pao3.getNome());
        System.out.println("Fabricação: " + pao3.getFabricacao());
        System.out.println("Fabricação: " + pao3.getFabricacao());
        System.out.println("Validade: " + pao3.data(null));
        System.out.println("Validade depois de aberto: " + pao3.data2(null));
        pao3.verificador(pao3.hoje(null), pao3.getFabricacao());

    }
}
