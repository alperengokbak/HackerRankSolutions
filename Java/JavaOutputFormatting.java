package Java;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String s2 = String.format("%-15s%03d", s1, x);
                System.out.println(s2);
            }   
            System.out.println("================================");
            sc.close();

    }
}