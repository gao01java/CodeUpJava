package Codeup_1;

import java.util.Scanner;

public class codeup_1084 {
    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);
        int c=0;
        int r=in.nextInt();
        int g=in.nextInt();
        int b=in.nextInt();
        for(int i=0;i<r;i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                    c++;
                }
            }
        }
        System.out.printf("%d",c);
    }
}
