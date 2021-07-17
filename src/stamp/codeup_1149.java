package stamp;

import java.util.Scanner;

/**
 *
 *
 * @작성날짜 2021년 5월19일 수요일 오후 3시19분
 * @작성자 Kenan
 * @문제 Codeup_1149번 두수중 큰수
 */

public class codeup_1149 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        if(a>b){
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }

    }
}
