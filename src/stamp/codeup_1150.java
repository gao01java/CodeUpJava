package stamp;

import java.util.Scanner;


/**
 * @작성날짜 2021년 5월19일 오후 3시23분
 * @작성자 Kenan
 * @문제 코드업 1150문제
 */
public class codeup_1150 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b && a>c){
            if(b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }else if(b>a && b>c){
            if(a<c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if(c>a && c>b){
            if(a<b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }else{
            System.out.println(a);
        }
    }
}
