package C02;
import java.util.Scanner;
public class rowColSum {
    public static void main(String[] args) {

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

        for(int i=0;i<r;i++){
            int rowSum = 0;
            for(int j=0;j<c;j++){
                rowSum += matrix[i][j];
            }
            System.out.println("Row "+i+" sum: "+rowSum);
        }
        for(int j=0;j<c;j++){
            int colSum = 0;
            for(int i=0;i<r;i++){
                colSum += matrix[i][j];
            }
            System.out.println("Column "+j+" sum: "+colSum);
        }

        sc.close();
    }
}
