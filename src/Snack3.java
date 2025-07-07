import java.util.Scanner;

public class Snack3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci primo numero :");
        int numero1 = scan.nextInt();
        System.out.println("Inserisci secondo numero :");
        int numero2 = scan.nextInt();
        System.out.println("Inserisci terzo numero :");
        int numero3 = scan.nextInt();
        System.out.println("Inserisci quarto numero :");
        int numero4 = scan.nextInt();
        System.out.println("Inserisci quinto numero :");
        int numero5 = scan.nextInt();
        System.out.println("Inserisci sesto numero :");
        int numero6 = scan.nextInt();
        System.out.println("Inserisci settimo numero :");
        int numero7 = scan.nextInt();
        System.out.println("Inserisci ottavo numero :");
        int numero8 = scan.nextInt();
        System.out.println("Inserisci nono numero :");
        int numero9 = scan.nextInt();
        System.out.println("Inserisci decimo numero :");
        int numero10 = scan.nextInt();

        int somma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;

        System.out.println("La somma e': " + somma);
    }
}