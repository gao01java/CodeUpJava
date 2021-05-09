package Codeup_1;

import java.util.Scanner;

public class codeup_1091 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int m=in.nextInt();
        int d=in.nextInt();
        int n=in.nextInt();
        long total=a;
        for(int i=1;i<n;i++){
            total=total*m+d;
        }
        System.out.println(total);
    }
}