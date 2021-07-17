package Codeup_2;

import java.util.Scanner;

public class codeup_1082 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt(16);
        for(int i=1;i<16;i++){
            System.out.printf("%X*%X=%X\n",a,i,a*i);
        }
    }
}
