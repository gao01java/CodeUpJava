package Codeup_1;

import java.util.Scanner;

public class codeup_1045 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();


        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        double A=(double)a;
        System.out.printf("%.2f",A/b);
    }
}
