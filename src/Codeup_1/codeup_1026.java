package Codeup_1;

import java.util.Scanner;

public class codeup_1026 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        String arr=in.next();
        String[] A = arr.split("\\:");
        int b = Integer.parseInt(A[1]);

        if(b <= 9)
            System.out.printf("%1d", b);
        else
            System.out.printf("%d", b);
    }
}
