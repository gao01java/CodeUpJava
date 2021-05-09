package Codeup_1;


import java.util.Scanner;
public class Main {

    public static void main(String[]args){

        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        if((a >= 30) && (a <= 40) || (a >= 60) && (a <= 70)){

            System.out.println("win");
        }else{
            System.out.println("lose");
        }

    }

}
