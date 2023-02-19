package Lab2;

import java.util.Arrays;

/**
 *
 * @author VQ
 */
public class NewClass {
    

public static void main(String[] args) {
    int[] a = {3, 2, 5, 1, 6, 7, 2, 4};
    int x = 1;
    System.out.println("Mang truoc khi xoa x:");
    System.out.println(Arrays.toString(a));
    xoaPhanTu(a, x);
    int[] b = Arrays.copyOf(a, a.length - demSoLuongPhanTuBangX(a, x));
    sapXepTangDan(b);
    System.out.println("Mang sau khi xoa x va sap xep tang dan:");
    xuatMang(b);
}

public static void xuatMang(int[] a) {
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}

public static void sapXepTangDan(int[] a) {
    Arrays.sort(a);
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

public static int demSoLuongPhanTuBangX(int[] a, int x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            count++;
        }
    }
    return count;
}
}