package Codeup_1;

import java.util.Scanner;


public class codeup_1064 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b){
            if(b>c){
                System.out.println(c);
            }else{
                System.out.println(b);
            }
        }else if(b>a){
            if(a>c){
                System.out.println(c);
            }else{
                System.out.println(a);
            }
        }else if(c>b){
            if(b>a){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }else if( a==b){
            if(b==c){
                System.out.println(a);
            }
        }

    }
}