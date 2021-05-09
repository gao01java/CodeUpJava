package Codeup_1;

import java.util.Scanner;

public class codeup_1163 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a =in.nextInt();

        int b=in.nextInt();
        int c=in.nextInt();

        int d=a+b+c;

        if((d/100)%2==0){
            System.out.println("대박");
        }else{
            System.out.println("그럭저럭");
        }
    }
}
