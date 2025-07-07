import java.util.Scanner;

public class Snack2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita la prima parola: ");
        String parola1 = scan.nextLine();
        System.out.println("Digita la seconda parola: ");
        String parola2 = scan.nextLine();
        
        

        if(parola1.length() > parola2.length() ) {
            System.out.println("La prima parola e' piu lunga");
        } else {
            System.out.println("La seconda parola e' piu lunga");
        }


    }
}
