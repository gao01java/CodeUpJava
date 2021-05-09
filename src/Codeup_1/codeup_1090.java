package Codeup_1;

import java.util.Scanner;

public class codeup_1090 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        long d=a;

        for(int i=1;i<c;i++){
            d*=b;
        }
        System.out.println(d);
    }
}
