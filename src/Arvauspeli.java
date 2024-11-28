import java.util.Random;
import java.util.Scanner;

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
            System.out.println("Yksi yksikkö rahaa vähennetty. Rahaa jäljellä: " + raha);

            if (raha <= 0) {
                System.out.println("Rahat loppui!");
                break;
            }

            if (raha >= 1 && raha <= 5) {
                System.out.println("Onneksi olkoon!");
                System.out.println(".");
                break;    
            } 
        }
    }
}

