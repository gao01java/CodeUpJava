package Codeup_1;

import java.util.Scanner;

public class codeup_1172 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>=b && a>=c){
            if(b>c){
                System.out.printf("%d %d %d",c,b,a);
            }else{
                System.out.printf("%d %d %d",b,c,a);
            }
        }else if(b>=a && b>=c){
            if(a>c){
                System.out.printf("%d %d %d",c,a,b);
            }else{
                System.out.printf("%d %d %d",a,c,b);
            }
        }else{
            if(a>b){
                System.out.printf("%d %d %d",b,a,c);
            }else{
              System.out.printf("%d %d %d", a, b, c);
            }
        }

    }
}
