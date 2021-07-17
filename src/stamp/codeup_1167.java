package stamp;

import java.util.Scanner;

public class codeup_1167 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d;

        if(a>b |a>c | b>c) {
            if(b>c){
                System.out.println(b);
            }else if(c>a){
                System.out.println(a);
            }
        }else{
            System.out.println(c);
        }

    }
}
