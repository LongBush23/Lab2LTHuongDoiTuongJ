package Lab2;
//lap menu cach 2
import java.util.Scanner;

/**
 *
 * @author VQ
 */
// lay du lieu tu bai4 
public class Bai4Cach2 {
    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Thoat menu");
        System.out.println("--- chon chuc nang --");
        Scanner scanner = new Scanner(System.in);
        
        int chon = scanner.nextInt();
        switch(chon){
            case 1:
                System.out.println("a=");
                float a= scanner.nextFloat();
                
                System.out.println("b=");
                float b= scanner.nextFloat();
                Lab2.Bai4.giaiPTBac1(a, b);
                
            case 2:
                System.out.println("a=");
                a= scanner.nextFloat();
                
                System.out.println("b=");
                b= scanner.nextFloat();
                
                System.out.println("c=");
                float c = scanner.nextFloat();
                Lab2.Bai4.giaiPTBac2(a, b, c);
            case 3:
                Lab2.Bai4.tinhTienDien();
            case 4:
                System.exit(0);
            default:
                System.exit(0);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("MENU");
        menu();
        }
    
}
