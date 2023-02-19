package Lab2;
// giai phuong trinh bac 1
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        float a, b, x;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao he so cua phuong trinh ax + b = 0");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        System.out.println("a=" +a + "\tb=" +b);
   
	if (a!= 0){
		x = -b/a;
                System.out.println("phuong trinh co nghiem x = " + x);
	} else if (b==0){
            System.out.println("phuong trinh vo so nghiem");
		
	}else {
            System.out.println("phuong trinh vo nghiem");
		
	}
    }
}	

