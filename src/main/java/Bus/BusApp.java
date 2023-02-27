package Bus;

import java.util.Scanner;

public class BusApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Bus uniBus = new Bus(41,15,"DPMLJ");

        for (int i = 1; i < 6; i++)
        {
            System.out.format("%d. zastavka", i);
            System.out.println(uniBus);
            System.out.println("Zadej kolik lidi chce vystoupit a nastoupit: ");
            uniBus.exit(sc.nextInt());
            uniBus.onboard(sc.nextInt());
            
        }
    }
}
