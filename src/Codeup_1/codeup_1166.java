package Codeup_1;

import java.util.Scanner;

public class codeup_1166 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int i=in.nextInt();

        if(i%4==0 && i%100 !=0){
            System.out.println("yes");
        }else{
            if(i%400==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
