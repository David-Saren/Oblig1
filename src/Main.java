import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Tast inn ditt fornavn");
        String fornavn = scanner.nextLine();
        System.out.println("Tast inn ditt etternavn");
        String etternavn = scanner.nextLine();
        scanner.close();

        String fulltNavn = fornavn + " " + etternavn + " ";
        System.out.println("Tenk at jeg : " + fulltNavn + "har naila oblig 1 allerede!");




    }
}
