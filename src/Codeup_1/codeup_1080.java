package Codeup_1;

import java.util.Scanner;

public class codeup_1080 {

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        for(int i=0;i<=a;i++){
            b=b+i;
            if(b>=a){
                System.out.println(i);
                break;
            }

        }
    }
}
