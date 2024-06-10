import java.util.Scanner;

public class calculadoraJava {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n1, n2, soma, op;
        int saida;

        do {

            System.out.println("Escolha uma operação: 1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
            op = scan.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Digite o 1º número:  \n");
                    n1 = scan.nextInt();
                    System.out.println("Digite o 2º número:  \n");
                    n2 = scan.nextInt();

                    soma = n1 + n2;

                    System.out.printf("%d + %d = %d", n1, n2, soma);

                    break;

                case 2:
                    System.out.println("Digite o 1º número:  \n");
                    n1 = scan.nextInt();
                    System.out.println("Digite o 2º número:  \n");
                    n2 = scan.nextInt();

                    soma = n1 - n2;

                    System.out.printf("%d - %d = %d", n1, n2, soma);

                    break;

                case 3:
                    System.out.println("Digite o 1º número:  \n");
                    n1 = scan.nextInt();
                    System.out.println("Digite o 2º número:  \n");
                    n2 = scan.nextInt();

                    soma = n1 * n2;

                    System.out.printf("%d x %d = %d", n1, n2, soma);

                    break;

                case 4:
                    System.out.println("Digite o 1º número:  \n");
                    n1 = scan.nextInt();
                    System.out.println("Digite o 2º número:  \n");
                    n2 = scan.nextInt();

                    double z = (double) n1 / (double) n2;

                    System.out.printf("%d / %d = %.2f", n1, n2, z);

                    break;

                default:
                    System.out.println("Operação Inválida!");
                    break;
            }
            System.out.println("\n\nDigite 0 para sair da calculadora.");
            saida = scan.nextInt();

            System.out.println("TESTE DE EDIÇÃO");

        } while (saida != 0);

        scan.close();
    }

}