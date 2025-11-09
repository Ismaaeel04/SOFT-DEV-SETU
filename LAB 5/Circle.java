public class Circle extends Point {
    
    protected int radius;

    public Circle(int x, int y, int r) {
        
        super(x, y);
        setRadius(r);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override

    public String toString() {
        return "Circle[(" + x + ", " + y + "), radius=" + radius + "]";
    }


}
