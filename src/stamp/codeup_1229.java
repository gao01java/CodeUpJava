package stamp;
/*
작성 날짜 2021년 5월18일 화요일 오후 9시18분
자성자:Kenan

 */
import java.util.Scanner;



public class codeup_1229 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble(); //身高
        double b=in.nextDouble(); //体重
        double d; //标准体重

        if(a<=150){
            d=(a-100);
            double a1=(b-d)*100/d;
            if(a1<10){
                System.out.println("정상");
            }else if(a1<=20){
                System.out.println("과체중");
            }else if(a1>=20){
                System.out.println("비만");
            }
        }

        else if(a<160){
            d=(a-150)/2+150;
            //d=151.07
            double a2=(b-d)*100/d;
            if(a2<10){
                System.out.println("정상");
            }else if(a2<=20){
                System.out.println("과체중");
            }else if(a2>=20){
                System.out.println("비만");
            }
        }else if(a>160){
            d=(a-100)*0.9;
            double a3=(b-d)*100/d;
            if(a3<10){
                System.out.println("정상");
            }else if(a3<=20){
                System.out.println("과체중");
            }else if(a3>20){
                System.out.println("비만");
            }
        }



    }
}
