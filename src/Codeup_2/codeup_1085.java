package Codeup_2;



import java.util.*;
public class codeup_1085 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);


         float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        float d=in.nextFloat();


        float e=(a*b*c*d)/8/1024/1024;

        System.out.printf("%.1f MB",e);
    }
}
