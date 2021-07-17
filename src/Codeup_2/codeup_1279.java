package Codeup_2;

import java.util.Scanner;

public class codeup_1279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i<=b; i++) {
            if (i%2 == 0) {
                c = c-i;
            }else {
                c = c+i;
            }
        }
        System.out.println(c);
    }
}
