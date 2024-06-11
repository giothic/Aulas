
public class fibonacci {

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
        return (num < 2) ? num: fibTer(num - 1) + fibTer(num - 2);

    }

    private static int[] vet = new int[50];
    private static int cont;

    static long fibVet(int num){
        cont = 1;
        return vetRec(num);
    }

    static long  vetRec(int num){
        if(num < 0){
            return vet[0];
        }else{
            if(cont <3 ){
                vet[num] = cont - 1;
                cont++;
            }else{
                vet[num] = vet[num + 1] + vet[num + 2];
            }
        }

        return vetRec(num - 1);
    }
    public static void main(String[] args) throws Exception {

        int i;

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fibonacci.fib(i) + "\t");

        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        for (i = 0; i < 30; i++) {
            System.out.println(i + "º - " + fibonacci.fibRec(i) + "\t");

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

        System.out.println("esse é o elemento na 7 posição:" + vet[7]);


    }
}
