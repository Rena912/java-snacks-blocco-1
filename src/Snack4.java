import java.util.Scanner;

public class Snack4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Inserisci l'invitato: ");
        String invitato = scan.nextLine();
        boolean invitatoPresente = false;
        for (int i = 0; i < invitati.length; i++) {
            if (invitato.equals(invitati[i])){
                invitatoPresente = true;
            }     
        }

        if(invitatoPresente){
            System.out.println("La Persona e' stata invitata");
        } else {
            System.out.println("La Persona non e' stata invitata");
        }
        
    }
}
    

