public class Cercle {
    private Point o ;
    private double r ;
    public Cercle(Point o, double r) {
        this.o = o;
        this.r = r;
    }
    public Point getO() {
        return o;
    }
    public double getR() {
        return r;
    }
    public void setO(Point o){
        this.o = o;
    }
    public void setR(double r){
        this.r = r;
    }
}
