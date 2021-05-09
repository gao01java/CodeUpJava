package Codeup_2;

import java.util.Scanner;

public class codeup_1203 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();

        if(a<=10){
            System.out.println("정상");
        }else if(a<=20){
            System.out.println("과체중");
        }else if(a>20){
            System.out.println("비만");
        }
    }
}
