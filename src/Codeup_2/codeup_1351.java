package Codeup_2;

import java.util.Scanner;

public class codeup_1351 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();


        for(int i=a;i<=b;i++){
           for(int j=1;j<=9;j++){
               System.out.println(i+"*"+j+"="+(i*j));
           }
        }
    }
}
