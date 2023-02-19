package Lab2;
//
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu trong mang : ");
        int n=scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
                System.out.print("  a["+i+"]= ");
                a[i]=scanner.nextInt();
            }
            System.out.println();
        System.out.println("Mang truoc khi xoa x:");
        System.out.println(Arrays.toString(a));
        System.out.println("nhap gia tri x");
        int x = scanner.nextInt();
        xoaPhanTu(a, x);
        System.out.println("Mang sau khi xoa x va sap xep tang dan:");
        sapXepTangDan(a);
        xuatMang(a);
    }

    public static void xuatMang(int[] a) {
    int i = 0;
    while (i < a.length && a[i] == 0) {
        i++;
    }
    if (i == a.length) {
        System.out.println("Mang rong");
        return;
    }
    System.out.print(a[i]);
    for (int j = i + 1; j < a.length; j++) {
        if (a[j] != 0) {
            System.out.print(", " + a[j]);
        }
    }
    System.out.println();
}
    public static void xoaPhanTu(int[] a, int x) {
        int n = a.length;
        int i, j;
        for (i = j = 0; i < n; i++) {
            if (a[i] != x) {
                a[j] = a[i];
                j++;
            }
        }
        while (j < n) {
            a[j] = 0;
            j++;
        }
    }

    public static void sapXepTangDan(int[] a) {
        Arrays.sort(a);
    }

//    public static void xuatMang(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
}