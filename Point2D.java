public class Point2D
{
    private double x;
    private double y;
    
    // Notkun : a = point2D(x,y)
    // Fyrir : ekkert
    // Eftir : X er punktur með hnitinu x og y
    public Point2D(double x0, double y0)
    {
        x = x0;
        y = y0;
    }
    
    // Notkun : distance = distanceTo(b)
    // Fyrir : b er ekki sami punktur og sá sem við erum að prófa
    // Eftir : vegalengdin reiknuð með pýþagoras reglunni
    public double distanceTo(point2D b)
    {
        double distance = Math.sqrt((Math.pow(b.y-y,2))+(Math.pow(b.x-x,2)));
        return distance;
    }
    
    // Notkun : c = getx()
    // Fyrir : engin
    // Eftir : c = x hniti punktsins sem við erum að vinna með
    public double getX()
    {
        return x;
    }
    // Notkun : c = gety()
    // Fyrir : engin
    // Eftir : c = y hniti punktsins sem við erum að vinna með
    public double getY()
    {
        return y;
    }
}