package Codeup_2;

import java.util.Scanner;

public class codeup_1352 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();


        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
