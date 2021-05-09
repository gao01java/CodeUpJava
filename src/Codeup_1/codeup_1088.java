package Codeup_1;

import java.util.Scanner;

public class codeup_1088 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;i<=a;i++){
            if(i%3!=0) System.out.println(i);
        }
    }
}
