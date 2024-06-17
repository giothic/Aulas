package estoque;

public class Principal {

    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo("Bolo de chocolate", 3, 5.50, "Chocolate");

        // System.out.println("AAAAAAAA" + bolo1.validade(null));

        System.out.println("Produto: " + bolo1.getNome());
    }
}
