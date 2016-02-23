public class Rectangle extends Shape {
    double x,y,h,w;
    // x,y eru hnitin fyrir miðjuna
    // hæðin er h > 0, breiddin er w > 0
    // Notkun: r = new Rectangle(x,y,w,h)
    // Fyrir: w > 0, h > 0
    // Eftir: r er ferhyrningur með miðju í x,y, hæð h og breidd w
    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    // Notkun: p = s.getCenter()
    // Fyrir: ekkert
    // Eftir: p er miðjan á s
    public Point2D getCenter() {
        return new Point2D(x,y);
    }
    // Notkun: r = s.getBoundingBox()
    // Fyrir: ekkert
    // Eftir: r er minnsti ferhyrningur sem passar utan um s
    public Rectangle getBoundingBox() {
        // við viljum ekki skila tilvísun á this því að það er
        // hægt að breyta hlutnum
        return new Rectangle(x,y,w,h);
    }
    // Notkun: c = s.intersects(o)
    // Fyrir: ekkert
    // Eftir: c er true of s og o skarast
    public boolean intersects(Shape o) {
        Rectangle box = o.getBoundingBox();
        return this.rectangleIntersects(box);
    }
    // Notkun: c = s.intersects(o)
    // Fyrir: ekkert
    // Eftir: c er true of s og o skarast
    private boolean rectangleIntersects(Rectangle o) {
        return (Math.abs(this.x-o.x) <= (this.w+o.w)/2)
        && (Math.abs(this.y-o.y) <= (this.h+o.h)/2);
    }
    // Notkun: s.scale(f)
    // Fyrir: f > 0
    // Eftir: s er f-sinnum stærra og miðjan er óbreytt
    public void scale(double f) {
        this.w *= f;
        this.h *= f;
    }
    // Notkun: w = a.getWidth()
    // Fyrir: ekkert
    // Eftir: w er breiddin á a
    public double getWidth() {
        return this.w;
    }
    // Notkun: h = a.getHeight()
    // Fyrir: ekkert
    // Eftir: h er hæðin á a
    public double getHeight() {
        return this.h;
    }
}