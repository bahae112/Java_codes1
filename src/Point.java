public class Point {
    protected double x , y ;
    public  Point( double x , double y){
        this.x = x ;
        this.y = y ;
    }
    public Point(){
        this.x = 0 ;
        this.y = 0 ;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    void afficher(){
        System.out.println("x=" + x + "y=" + y );
    }
    void demarer( double dx , double dy ){
        x += dx;
        y += dy;
        System.out.println("x=" + x + "y=" + y );
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public static Point plusLoin(Point p1 , Point p2 ){
        double distance1 = Math.sqrt(Math.pow(p1.x, 2) + Math.pow(p1.y, 2));
        double distance2 = Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2));
        if(distance1 < distance2 ){
            System.out.println(" le plus loins c'est :" + "p2");
            System.out.println(" avec x =   " + p2.x);
            System.out.println(" avec y =   " + p2.y);
            return p2;
        }else{
            System.out.println(" le plus loins c'est :" + "p1");
            System.out.println(" avec x =   " + p1.x);
            System.out.println(" avec y =   " + p1.y);
            return p1;
        }
    }
    public Point plusLoin(Point p ){
        double distance1 = Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
        double distance2 = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        if(distance1 < distance2 ){
            System.out.println(" le plus loins c'est :" + p);
            System.out.println(" avec x =   " + p.x);
            System.out.println(" avec y =   " + p.y);
            return p;
        }else{
            System.out.println(" le plus loins c'est :" + this);
            System.out.println(" avec x =   " + this.x);
            System.out.println(" avec y =   " + this.y);
            return this;
        }
    }
    public void deplacer( double dx , double dy){
         x += dx;
         y += dy;
         System.out.println(" le nouveau x c'est " + x);
         System.out.println(" le nouveau y c'est " + y);
    }

}
