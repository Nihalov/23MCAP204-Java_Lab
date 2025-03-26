package C02;
import java.util.Scanner;

public class matrixSymmetric{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter the matrix");
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int n = matrix.length;
        boolean symmetric = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    symmetric = false;
                    break;
                }
            }

            if(!symmetric){
                System.out.println("Matrix is not Symmetric");
                break;
            }
                
        }

        if(symmetric)
            System.out.println("Matrix is Symmetric");
        sc.close();
    }
    
}