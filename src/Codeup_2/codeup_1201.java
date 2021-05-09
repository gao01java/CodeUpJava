package Codeup_2;

import java.util.Scanner;

public class codeup_1201 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a>0){
            System.out.println("양수");
        }else if(a==0){
            System.out.println(a);
        }else {
            System.out.println("음수");
        }
    }
}
