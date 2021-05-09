package Codeup_1;

import java.util.Scanner;

public class codeup_1154 {
    public static void main(String[]args){

        Scanner a=new Scanner(System.in);

        int num1=a.nextInt();
        int num2=a.nextInt();

        if(num1>num2 ){
            System.out.println(num1-num2);

        }
        else if (num2>num1){
            System.out.println(num2-num1);
        } else if(num1 ==num2){
            System.out.println(num2-num1);
        }



    }
}
