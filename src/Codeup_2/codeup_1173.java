package Codeup_2;
/**
 * 예)
 * 12 35  =====> 12 5
 *
 * 12 0 ======> 11 30
 *
 * 11 5 ======> 10 35
 */

import java.util.*;
public class codeup_1173 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        if(a>0&&b>=30) {
            System.out.printf("%d %d", a, b - 30);
        }else if(a>0&&b<30) {
            System.out.printf("%d %d", a - 1, b + 30);
        }else if(a<0&&b>=30) {
            System.out.printf("%d %d", a + 23, b - 30);
        }else if(a<0&&b<30) {
            System.out.printf("%d %d", a + 22, b + 30);
        }else if(a==0&&b>=30) {
            System.out.printf("%d %d", a, b - 30);
        }else if(a==0&&b<30) {
            System.out.printf("%d %d", a + 23, b + 30);
        }
    }
}
