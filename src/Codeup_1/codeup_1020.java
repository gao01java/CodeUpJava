package Codeup_1;

import java.util.Scanner;

public class codeup_1020 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String[] arr = a.split("\\-");
        System.out.printf("%s%s",arr[0],arr[1]);
    }
}
