package Codeup_2;

import java.util.Scanner;

public class codeup_1170 {
    public static void main(String[]args){

        /**
         * 2 3 27   =====>    2327로 출력
         *
         * 2 3 7   ======> 2307로 출력   (번호가 10번미만이면 0을 붙여 출력)
         */


        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(c>=10){
            System.out.printf("%d%d%d",a,b,c);
        }else if(c<10){
            System.out.printf("%d%d0%d",a,b,c);
        }
    }
}
