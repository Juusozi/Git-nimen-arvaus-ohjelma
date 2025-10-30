import java.util.Scanner;

public class Nimenarvausohjelma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oikeaNimi = "Juuso";
        String arvaus = "";
        int yritykset = 0;

        while (true) {
            System.out.print("Arvaa nimi (tai kirjoita 'lopeta' lopettaaksesi): ");
            arvaus = scanner.nextLine();
            yritykset++;
            
            if (arvaus.equalsIgnoreCase("loppu")) {
                System.out.println("Peli lopetettu. Arvasit " + (yritykset - 1) + " kertaa. ");
                break;
            } else if (arvaus.equalsIgnoreCase(oikeaNimi)) {
                System.out.println("Oikein, onneksi olkoon!");
                System.out.println("Arvasit oikein " + yritykset + ". yrityksellä.");
                break;
            } else {
                System.out.println("Väärin, yritä uudelleen.");
            }  
        }

        scanner.close();

        }
}