package Lab2;
// lap menu
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai4 {     
    public static void giaiPTBac1(float a, float b){
        if (a!= 0){
		float x = -b/a;
                System.out.println("phuong trinh co nghiem x = " + x);
	} else if (b==0){
            System.out.println("phuong trinh vo so nghiem");
		
	}else {
            System.out.println("phuong trinh vo nghiem");
		
	}
        }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
 
        // tính nghiệm
        if (delta > 0) {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            float x1 = (-b / (2 * a));
            System.out.println("phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("phuong trinh vo nghiem!");
        }
        }
    public static void tinhTienDien() {
        float soDien;
        float tienDien;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so dien cua ban (kWh):\t(so dien phai lon hon 0)");
            soDien = scanner.nextFloat();
	}while(soDien<0);
		if(soDien<=50){
			tienDien=soDien * 1000;
                        System.out.println("so tien dien su dung la: "+ tienDien);
	}else{
			tienDien=50 * 1000 + (soDien-50) * 1200 ;
                        System.out.println("so tien dien su dung la: "+tienDien);
	}
    }
    public static void main(String[] args) {
        System.out.println("MENU");
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
                giaiPTBac1(a, b);
                
            case 2:
                System.out.println("a=");
                a= scanner.nextFloat();
                
                System.out.println("b=");
                b= scanner.nextFloat();
                
                System.out.println("c=");
                float c = scanner.nextFloat();
                giaiPTBac2(a, b, c);
            case 3:
                tinhTienDien();
            case 4:
                System.exit(0);
            default:
                System.exit(0);
        }
        
        
    }
        
    }
    
     
    

