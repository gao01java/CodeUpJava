package Codeup_2;

import java.util.Scanner;

public class codeup_1087 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        int c=0;

        while (true){
            s+=c;
            c+=1;
            if(s>=n)
                break;
        }
       System.out.println(s);
    }
}
