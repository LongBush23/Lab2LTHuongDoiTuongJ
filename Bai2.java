package Lab2;
//giai phuong trinh bac 2
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai2 {
    public static void main(String[] args) {
        float a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao he so a, b, c lan luot la:");
        
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: "
                        + "x = " + (-c / b));
            }
        }
        // tính delta
        delta = b*b - 4*a*c;
 
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("phuong trinh vo nghiem!");
        }
        }
    }
    

