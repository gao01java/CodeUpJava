package Codeup_1;

import java.util.Scanner;

public class codeup_1027 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);

        String arr=in.next();
        String[] ar = arr.split("\\.");
        System.out.printf("%s-%s-%s",ar[2],ar[1], ar[0]);
    }
}
