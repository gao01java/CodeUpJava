package Codeup_1;

import java.util.Scanner;

public class codeup_1257 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();


        int c=0;

        for(int i=a;i<=b;i++){
            if(i%2!=0)
            System.out.printf("%d ",i);
        }

    }
}
