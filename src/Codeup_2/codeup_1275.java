package Codeup_2;

import java.util.Scanner;

public class codeup_1275 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=1;
        int d=0;


        for(int i=1;i<=b;i++){
            c*=a;

        }
        System.out.println(c);
    }
}
