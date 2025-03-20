package ovchipkaart;

import java.util.Scanner;

public class ovchipkaart
{

    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	System.out.println("Wil je in of uit checken?");
	String antwoord = input.nextLine();
	
	if (antwoord == "inchecken") {
	    System.out.println("ingecheckt");
	}
	else {
	    System.out.println("nee");
	}
	
	
	
	input.close();
	
    }

}
