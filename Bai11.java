package Lab2;

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai11 {
    static int n,matrix[][];
    public static void nhapmatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang(cot): ");
        n=input.nextInt();
        matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  a["+i+","+j+"]=");
                matrix[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
    public static void xuatmatrix(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        nhapmatrix();
        xuatmatrix();
        
    }
}
    

