package Lab2;
//dau vao so nguyen la chu so
//dau ra la chu

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai8 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.print(" nhap ba chu so");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        switch(a)
        {
            case 0: System.out.print("  ");break;
            case 1: System.out.print(" mot tram ");break;
            case 2: System.out.print(" hai tram ");break;
            case 3: System.out.print(" ba tram ");break;
            case 4: System.out.print(" bon tram ");break;
            case 5: System.out.print(" nam tram ");break;
            case 6: System.out.print(" sau tram ");break;
            case 7: System.out.print(" bay tram ");break;
            case 8: System.out.print(" tam tram ");break;
            case 9: System.out.print(" chim tram ");break;
            default:
            System.out.println("vui long nhap lai");
        }
         switch(b) 
         {
            case 0: System.out.print(" le ");break;
            case 1: System.out.print(" muoi ");break;
            case 2: System.out.print(" hai muoi ");break;
            case 3: System.out.print(" ba muoi ");break;
            case 4: System.out.print(" bon muoi ");break;
            case 5: System.out.print(" nam muoi ");break;
            case 6: System.out.print(" sau muoi ");break;
            case 7: System.out.print(" bay muoi ");break;
            case 8: System.out.print(" tam muoi ");break;
            case 9: System.out.print(" chim muoi ");break;
            default:
            System.out.println("vui long nhap lai");
         }     
        switch(c)   
        {
            case 0: System.out.print(" ");break;
            case 1: System.out.print(" mot ");break;
            case 2: System.out.print(" hai  ");break;
            case 3: System.out.print(" ba  ");break;
            case 4: System.out.print(" bon  ");break;
            case 5: System.out.print(" nam  ");break;
            case 6: System.out.print(" sau  ");break;
            case 7: System.out.print(" bay  ");break;
            case 8: System.out.print(" tam  ");break;
            case 9: System.out.print(" chin ");break;
            default:
            System.out.println("vui long nhap lai");
        
    }
    
    }
}
