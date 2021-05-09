package Codeup_2;

import java.util.Scanner;

public class codeup_1165 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        int c=90-a;

        if(c==0){
            System.out.println(b);

        }else{
            b+=1;
            if(a>=5){
                b=(a-1)/5;
            }
            System.out.println(b);
        }

    }
}
