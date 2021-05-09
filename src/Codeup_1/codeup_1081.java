package Codeup_1;

import java.util.Scanner;

public class codeup_1081 {
    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
