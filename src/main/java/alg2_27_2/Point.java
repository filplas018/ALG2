package alg2_27_2;

/**
 * Repsesents a point in 2D
 */

public class Point
{
    //data - clenske promenne, atributy = stavy které se mohou měnit
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //metody ktere pracuji nad daty
    public double distance(){
        return Math.hypot(x,y);
    }

    @Override
    public String toString() {
        return String.format("x: %.2f y: %.2f", x,y);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        if(x > 0){
            this.x = x;
        }
    }

    public void setY(double y){
        if(y > 0){
            this.y = y;
        }
    }

    //testovaci main
    public static void main(String[] args)
    {
        Point pointA = new Point(3,4);
        double result = pointA.distance();
        System.out.println(result);
        System.out.println(pointA);
    }


}
