import java.util.Scanner;
public class Snack1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita il primo numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Digita il secondo numero numero: ");
        int numero2 = scan.nextInt();
        
        

        if(numero1 > numero2 ) {
            System.out.println("Il primo numero e' maggiore");
        } else {
            System.out.println("Il secondo numero e' maggiore");
        }


    }
}
