
import java.util.Scanner;

public class MexicoPopulation {


    public static void main(String args[]) {

        int y = 2014;
        double r = 0.5;
        double p = 123.8;
        double np = 123.8;
        int ny = 2014;

        Scanner sc = new Scanner(System.in);
        System.out.print("population: ");
        double amt = sc.nextDouble();


                while ( np < amt )
                {
                    np = (p * r) + np;
                    ny = ny + 1;
                }

System.out.println("population will reach " + amt + " by year " + ny);

    }
}

