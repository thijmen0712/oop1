package ovchipkaart;

import java.util.Scanner;

public class Ovsysteem {

    static class Menu {
        static void print() {
            System.out.println("Keuzemenu:");
            System.out.println("1. Inchecken");
            System.out.println("2. Uitchecken");
            System.out.println("3. Saldo opwaarderen");
            System.out.println("4. Stoppen");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OVChipkaart kaart = new OVChipkaart();  // Nieuwe OV-chipkaart aanmaken
        boolean bezig = true;

        while (bezig) {
            Menu.print();
            int keuze = input.nextInt();

            switch (keuze) {
                case 1 -> Paaltje.inchecken(kaart);
                case 2 -> Paaltje.uitchecken(kaart);
                case 3 -> Oplaadpunt.opwaarderen(kaart);
                case 4 -> bezig = false;
                default -> System.out.println("Geen geldige invoer, kies een nummer uit het menu.");
            }
        }

        System.out.println("Gestopt!");
        input.close();
    }
}
