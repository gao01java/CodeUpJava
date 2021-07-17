package Codeup_2;

import java.util.Scanner;

public class codeup_1268 {

        public static void main(String[]args){

            Scanner in=new Scanner(System.in);

            int a=in.nextInt(); //5

            int c=0;
            for(int i=1;i<=a;i++){
                int b=in.nextInt();

                if(b%2==0)
                    c+=1;
            }
            System.out.println(c);
        }

}
