package Codeup_1;

import java.util.Scanner;

public class codeup_1078 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);


        int a=0;
        int b=in.nextInt();

        for(int i=1;i<=b;i++){
            if(i%2==0) a=a+i;
        }
        System.out.println(a);

    }
}
