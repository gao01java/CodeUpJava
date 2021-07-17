package stamp;

/**
 * @작성날짜 2021년 5월23일 일요일 오전 11시31분
 *
 */

import java.util.Scanner;

public class codeup_1024 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

       String a=in.next();
       int len=a.length();
       for(int j=0;j<len;j++){

           System.out.printf("\'%c\'\n", a.charAt(j));
       }
    }


}
