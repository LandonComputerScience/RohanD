
import java.util.Scanner;


public class Cents0 {


    public static void main(String args[]) {
        int i;
        int d;
        int n;
        int p;
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();

        for (i = 0; i * 25 <= amt; i++) {

            for (d = 0; (d * 10)+(i * 25) <= amt; d++) {

                for (n = 0; (n * 5)+(d * 10)+(i * 25) <= amt; n++) {
                    p = amt - ((n * 5) + (d * 10) + (i * 25));


                    System.out.println("quarters " + i + " dimes " + d + " nickels " + n + " pennies " + p);

                }


            }
        }
    }
}