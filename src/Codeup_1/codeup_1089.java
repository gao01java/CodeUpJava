package Codeup_1;

import java.util.Scanner;

public class codeup_1089 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        for(int i=1;i<c;i++){
            a+=b;
        }
        System.out.println(a);
    }
}
