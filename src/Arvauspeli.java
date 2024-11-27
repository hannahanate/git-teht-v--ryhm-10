import java.util.Scanner;
import java.util.Random;

public class Arvauspeli {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        Random rand = new Random();
        String arvo = "k";
 
        int Eka = rand.nextInt(10);
        int Toka = rand.nextInt(10);
        int Kolmas = rand.nextInt(10);

        int raha;


        while (true) {
            System.out.println("Kuinka paljon rahaa haluat käyttää?");
            raha = in.nextInt();

            raha--;
            System.out.println("Yksi rahayksikkö vähennetty. Rahaa jäljellä: " + raha);

            if (raha <= 0) {
                System.out.println("rahat loppui");
                break;
            }

            if (raha >= 1 && raha <= 5) {
                System.out.println("Congratulations!");
                System.out.println(".");
                break;    
            } 
        }
    }
}

