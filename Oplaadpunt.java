package ovchipkaart;

import java.util.Scanner;

public class Oplaadpunt {
    public static void opwaarderen(OVChipkaart kaart) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoeveel wil je opwaarderen?");
        int opwaarderen = input.nextInt();
        kaart.voegSaldoToe(opwaarderen);
        System.out.println("Succesvol: je nieuwe saldo is €" + kaart.getSaldo() + "!");
    }
}
