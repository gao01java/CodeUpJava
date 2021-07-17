package stamp;

import java.util.Scanner;

/**
 * @작성날짜:2021년5월23
 */

public class codeup_1165 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();//登场时间
        int b=in.nextInt();//已经进球的数量


        for(int i=a;i<90;i+=5) {
            b ++;
        }
        System.out.println(b);
    }
}
