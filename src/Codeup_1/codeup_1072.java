package Codeup_1;

import java.util.Scanner;

public class codeup_1072 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b[]=new int[a];


        for(int i=0;i<a;i++){
            b[i]=in.nextInt();
        }

        for(int i=0;i<a;i++){

            System.out.println(b[i]);
        }
    }
}
