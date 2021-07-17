package Codeup_2;

import java.util.Scanner;

public class codeup_1271 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int num1=in.nextInt();
        int num2=0;

        for(int i=1;i<=num1;i++){
            int num3=in.nextInt();
            if(num3>=num2)
                num2=num3;
        }
        System.out.println(num2);
    }
}
