package stamp;

import java.util.Scanner;


/*
작성 날짜 2021년 5월18일 화요일 오후 8:52분
작성자:Kenan
작정위치:어느 카페 
 */
public class codeup_1228 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        double a=in.nextDouble();
        double b=in.nextDouble();

        double c=(a-100)*0.9;

        double d=(b-c)*100/c;

        if(d<10){
            System.out.println("정상");
        }else if(d<20){
            System.out.println("과체중");
        }else if(d>20){
            System.out.println("비만");
        }
    }
}
