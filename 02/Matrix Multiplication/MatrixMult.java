import java.util.Scanner;

public class MatrixMult{
    public static void main(String[] args){
        int rowA;
        int rowB;
        int colA;
        int colB;
        
        Scanner scan = new Scanner(System.in);

        colA = scan.nextInt();
        rowA = scan.nextInt();
        colB = scan.nextInt();
        rowB = scan.nextInt();

        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];

        for (int i=0;i<rowA;i++){
            for (int j=0;j<colA;j++){
                matrixA[i][j]=scan.nextInt();
            }
        }

        for (int i=0;i<rowB;i++){
            for (int j=0;j<colB;j++){
                matrixB[i][j]=scan.nextInt();
            }
        }

        int[][] output = new int[rowA][colB];

        if (colA!=rowB){
            System.out.println("Invalid input.");

        } else if (colA==0||colB==0||rowA==0||rowB==0){
            System.out.println(0);
        } else {
            for (int i=0; i<rowA;i++){
                for (int j=0;j<colB;j++){
                    int count =0;
                    for (int k=0;k<rowB;k++){
                        count += matrixA[i][k]*matrixB[k][j];
                    }
                    output[i][j] = count;
                }
            }

        for (int i=0;i<rowA;i++){
            for (int j=0;j<colB;j++){
                if (j==colB-1){
                    System.out.print(output[i][j]);
                    } else {
                        System.out.printf(output[i][j] + " ");
                        }
                    }
                        System.out.println();
                }
            }
        }
}
