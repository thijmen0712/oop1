package ovchipkaart;

import java.util.Scanner;

public class Oplaadpunt
{
    static int saldo = 0;
    
    public static void opwaarderen()
    {
	Scanner input = new Scanner(System.in);
	System.out.println("hoeveel wil je opwaarderen?");
	int opwaarderen = input.nextInt();
	saldo = saldo + opwaarderen;
	System.out.println("Succesvol: je nieuwe saldo is €" + saldo +"!");
    }




}
