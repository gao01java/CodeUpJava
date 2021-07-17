package stamp;


/**
 * @작성날짜:2021년 5월 23일 일요일 오전 11시47분
 */

import java.util.Scanner;

public class codeup_1025 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt(); //75254

        int b=a-a%10000; //70000
        int c=a%10000-a%1000;//5000
        int d=a%1000-a%100;
        int e=a%100-a%10;
        int f=a%10-a%1;
        System.out.printf("[%d]\n",b);
        System.out.printf("[%d]\n",c);
        System.out.printf("[%d]\n",d);
        System.out.printf("[%d]\n",e);
        System.out.printf("[%d]",f);
    }
}
