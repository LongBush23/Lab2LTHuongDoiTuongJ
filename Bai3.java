package Lab2;
// tinh tien dien
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float soDien, tienDien;
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
   
    
}
