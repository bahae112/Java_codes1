public class PointNomme extends Point {
    private String nom;
    public PointNomme( int x, int y, String nm )  {
        super(x, y);
        this.nom = nm;
    }
    public void affiche(){
        System.out.println("coordonnes (x,y) = " + "(" + x + "," + y + ")");
        System.out.println("Nom" + nom);
    }

}
