package Codeup_1;

import java.util.Scanner;

public class codeup_1255 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        double a=in.nextDouble();
        double b=in.nextDouble();

        for(double i=a;i<=b;i+=0.1){
            System.out.printf("%.2f ", i);
        }
    }
}
