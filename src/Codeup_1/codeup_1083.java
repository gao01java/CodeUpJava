package Codeup_1;

import java.util.Scanner;

public class codeup_1083 {

    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();



        for(int i=1;i<=a;i++){

            if(i%10==3 || i%6==0||i%9==0)
                System.out.print("X ");
            else
                System.out.print(i+" ");
        }

    }
}
