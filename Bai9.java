package Lab2;
//

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai9 {
    public static void tinhGiaiThua() {
        int n, fact = 1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("nhap so nguyen n ");
            n = scanner.nextInt();
        }while(n<=0);
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Giai thua cua so nguyen "+ n + " = "+ fact );
    
}
    public static void main(String[] args) {
        tinhGiaiThua();
    }
}

