package Lab2;
//su dung if else ktra so chinh phuong

import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so can kiem tra : ");
        n = scanner.nextInt();
        
        float temp = (float) Math.sqrt(n);
        
        if(temp==(int)temp){
            System.out.println(n + " la so chinh phuong");
        }else{
            System.out.println(n + " khong phai la so chinh phuong");
        }
        
    }
    
}
