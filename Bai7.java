/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
// xep loai hoc sinh
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so diem tong ket cua hocj sinh :");
        float n = scanner.nextFloat();
        
        if(n<5&&n>=0){
            System.out.println("hocj sinh thuoc loai kem ");
            
        }else if(5<=n&&n<7){
            System.out.println("hoc sinh thuoc loai trung binh");
        }else if(7<=n&&n<8){
            System.out.println("hoc sinh thuoc kha");
        }else if(8<=n&&n<=10){
            System.out.println("hoc sinh thuoc loai gioi");
        }else{
            System.out.println("so diem nhap khong dung");
            System.exit(0);
        }
        
    }
    
}
