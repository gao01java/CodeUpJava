package Codeup_1;

import java.util.Scanner;

public class codeup_1164 {

    public static void main(String[]args){

        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();


        if(170<num1){
            if (170 < num2) {
                if(170<num3){
                    System.out.println("PASS");
                }else{
                    System.out.println("CRASH");
                }
            }else{
                System.out.println("CRASH");
            }
        }else{
            System.out.println("CRASH");
        }



    }
}
