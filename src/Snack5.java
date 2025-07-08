import java.util.Scanner;
public class Snack5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("digita un numero: ");
            int numero = scan.nextInt();

            if(i % 2 == 0){
            } else {
                System.out.println("Il numero e' dispari");
            }
        }
    }
    
}
