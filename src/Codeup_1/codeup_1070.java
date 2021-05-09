package Codeup_1;

import java.util.Scanner;

public class codeup_1070 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a-12==0 | a-1==0 | a-2==0){
            System.out.println("winter");
        }else if(a-3==0 | a-4==0 | a-5==0){
            System.out.println("spring");
        } else if(a-6==0 | a-7==0 | a-8==0){
            System.out.println("summer");
        }else if(a-9==0 | a-10==0 | a-11==0){
            System.out.println("fall");
        }
    }
}
