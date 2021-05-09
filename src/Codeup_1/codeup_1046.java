package Codeup_1;

import java.io.PrintStream;
import java.util.Scanner;

public class codeup_1046 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int e=in.nextInt();
        int c=a+b+e;

        System.out.println(c);


        double d=(double) c/3;
        System.out.printf("%.1f",d);

    }
}
