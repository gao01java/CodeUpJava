package Codeup_1;

import java.util.Scanner;

public class codeup_1068 {
    public static void main(String[]args){

        Scanner in=new Scanner(System.in);


        int num1=in.nextInt();


        if(num1>=90){
            System.out.println("A");

        }else if(num1>=70){
            System.out.println("B");
        }else if(num1>=40){
            System.out.println("C");
        }else{
            System.out.println("D");
        }


    }
}
