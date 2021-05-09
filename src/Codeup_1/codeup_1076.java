package Codeup_1;

import java.util.Scanner;

public class codeup_1076 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        char a='a';
        char b=in.next().charAt(0);
        do{
            System.out.println(a);
            a+=1;
        }while(a<=b);
    }
}
