import java.util.Scanner;
import java.util.Random;

public class Arvauspeli {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        Random rand = new Random();
        String arvo = "k";
 
        int eka = rand.nextInt(10);
        int toka = rand.nextInt(10);
        int kolmas = rand.nextInt(10);
        int raha;


        while (true) {
            System.out.println("Kuinka paljon rahaa haluat käyttää?");
            raha = in.nextLine();
            raha--;

            if (raha.equals(0)) {
                System.out.println("rahat loppui");
                break;
            }

            if (raha.equals(1,2,3,4,5)) {
                System.out.println("Congratulations!");
                System.out.println(".");
                break; 
            } 
        }
    }
}

