
import java.util.Scanner;

public class Javabook {

    public static void main(String args[]) {

        int m = 0;
        int nm = 0;
        double i = 0;
        double r = 0.10;
        double b = 100;
        double nb = 0;
        double g = 0.95;


        while ( nb < g )
        {
            nb = nb + ( 1 - nb ) * r;
            System.out.println(nb);
            nm = nm + 1;
        }

        System.out.println("He will know " + g + " percent in " + nm + " months ");

    }
}
