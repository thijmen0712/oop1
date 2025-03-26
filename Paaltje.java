package ovchipkaart;

public class Paaltje
{
    static boolean ingecheckt;

    public static void inchecken() {
        if (Oplaadpunt.saldo > 5) {
            ingecheckt = true;
            System.out.println("Je bent ingecheckt.");
        } else {
            System.out.println("Saldo te laag om in te checken.");
        }
    }

    public static void uitchecken()
    {
	System.out.println("Je bent uitgecheckt");
	ingecheckt = false;
    }

}
