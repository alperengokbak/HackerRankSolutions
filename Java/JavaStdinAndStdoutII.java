package Java;
import java.util.Scanner;

public class JavaStdinAndStdoutII {     //You have to rename class name to "Solution"

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        s = scan.nextLine();
        scan.close();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

