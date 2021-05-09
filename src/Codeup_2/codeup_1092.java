package Codeup_2;

import java.util.Scanner;
public class codeup_1092 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int day=1;
        while(day%a!=0 || day%b!=0 || day%c!=0) {
day++;
        }
        System.out.println(day);
    }
}
