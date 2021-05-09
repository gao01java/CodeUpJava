package Codeup_2;

import java.util.Scanner;

public class codeup_1161 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if((a%2) != 0){
            System.out.printf("홀수+");
            if((b%2) != 0){
                System.out.printf("홀수=짝수");
            }
            else if((b%2) == 0){
                System.out.printf("짝수=홀수");
            }
        }
        else if((a%2) == 0){
            System.out.printf("짝수+");
            if((b%2) != 0){
                System.out.printf("홀수=홀수");
            }
            if((b%2) == 0){
                System.out.printf("짝수=짝수");
            }
        }

    }
}
