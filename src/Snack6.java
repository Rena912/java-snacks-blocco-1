import java.util.Scanner;

public class Snack6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la lughezza del lato del quadrato: ");
        int lato = scan.nextInt();

        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print(lato);
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }

    }

}
