package Codeup_2;

import java.util.Scanner;

public class codeup_1418 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        String s = in.nextLine();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='t')
                System.out.printf("%d ", i + 1);
        }

    }
}
