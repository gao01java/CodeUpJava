package Codeup_1;

import java.util.Scanner;

public class codeup_1159 {
    public static void main(String[]args){

        Scanner a=new Scanner(System.in);

        int num1=a.nextInt();

        if(num1>=50 && num1<=70){
            System.out.println("win");
        } else if(num1%6==0){
            System.out.println("win");
        } else{
            System.out.println("lose");
        }


    }
}
