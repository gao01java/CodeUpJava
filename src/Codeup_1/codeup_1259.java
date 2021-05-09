package Codeup_1;

import java.util.Scanner;

public class codeup_1259 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int c=0;

        for(int i=0;i<=a;i++){
            if(i%2==0){

                c+=i;

            }
        }
        System.out.println(c);
    }
}
