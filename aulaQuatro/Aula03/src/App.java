public class App {
    public static void main(String[] args){
        
    int i, j;
    int mat[][] = new int [10][10];


    for(i = 0; i <= 9; i++){
        for(j = 0; j <= 9; j++){
            mat[i][j] = i * j;
        }
    }

    for(i = 0; i <= 9; i++){
        for(j = 0; j <= 9; j++){
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }


    }
}
