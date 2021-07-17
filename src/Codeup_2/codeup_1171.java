package Codeup_2;

import java.util.Scanner;

public class codeup_1171 {
    public static void main(String[]args){


        /**
         * 예)
         * 2 1 20  ===> 201020  으로 출력
         *
         * 2 2 7 ==> 202007 으로 출력
         *
         * 2 3 100 ==>  203100 으로 출력
         *
         * 2 10 111 ==> 210111 로 출력
         */

        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(b>=10){
            if(c>=10&&c<=99){
                System.out.printf("%d%d0%d",a,b,c);
            }else if(c<10){
                System.out.printf("%d%d00%d",a,b,c);
            }else{
                System.out.printf("%d%d%d",a,b,c);
            }
        }else{
            if(c>=10&&c<=99){
                System.out.printf("%d0%d0%d",a,b,c);
            }else if(c<10){
                System.out.printf("%d0%d00%d",a,b,c);
            }else{
                System.out.printf("%d0%d%d",a,b,c);
            }
        }
    }
}
