package Codeup_1;

import java.util.Scanner;

public class codeup_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("minus");
        }else{
            System.out.println("plus");
        }
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

/*
        minus_or_plus(n);
        even_or_odd(n);*/

/*
    public static void minus_or_plus(int num) {
        if(num<0)
            System.out.println("minus");
        else
            System.out.println("plus");
    }

    public static void even_or_odd(int num) {
        if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }*/
}
