package stamp;

import java.util.Scanner;

/**
 * @작성날짜 2021년 5월19일 오후 3시30분
 * @작성자 Kenan
 * @문제 코드업 1122문제
 */
public class codeup_1122 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();

        int b;

        b=a/60;
        a=a%60;
        System.out.printf("%d %d",b,a);



    }
}
