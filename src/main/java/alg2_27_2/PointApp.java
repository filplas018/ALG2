package alg2_27_2;

import java.util.Scanner;

public class PointApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Souradnice: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point pointA = new Point(x,y);
        double result = pointA.distance();
        System.out.format("Vzdalenost od pocatku je %.2f", result);
        System.out.println("Zadej dalsi bod");
        Point pointB = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println(pointB.distance());
        System.out.println(pointB);
        System.out.println(pointB);
    }
}
