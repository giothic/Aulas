public class App {

    private static int[] vet = new int[30]; // Reduzi o tamanho do vetor para 30, que é o valor máximo que você está usando.

    static long fib(int num) {
        int F = 0;
        int ant = 0;

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }

        return F;
    }

    static long fibRec(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibRec(i - 1) + fibRec(i - 2);
        }
    }

    static long fibTer(int num) {
        return (num < 2) ? num : fibTer(num - 1) + fibTer(num - 2);
    }

    static long fibVet(int num) {
        return vetRec(num);
    }

    static long vetRec(int num) {
        if (num < 2) {
            vet[num] = num;
        } else {
            if (vet[num] == 0) {
                vet[num] = (int) (vetRec(num - 1) + vetRec(num - 2));
            }
        }
        return vet[num];
    }

    public static void main(String[] args) {
        int i;

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fib(i) + "\t");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fibRec(i) + "\t");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fibTer(i) + "\t");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fibVet(i) + "\t");
        }
    }
}
