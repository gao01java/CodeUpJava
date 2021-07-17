package Codeup_2;

import java.util.Scanner;

public class codeup_1253_1 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        int temp=0;

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        for(int i=a;i<=b;i++){
            System.out.printf("%d ",i);
        }
    }
}
