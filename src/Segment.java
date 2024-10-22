public class Segment {
    private Point origine;
    private Point extremite;

    public Segment(Point origine, Point extremite) {
        this.origine = origine;
        this.extremite = extremite;
    }

    public Segment(double xOr, double yOr, double xExt, double yExt) {
        this.origine = new Point(xOr, yOr);
        this.extremite = new Point(xExt, yExt);
    }

    double longueur() {
        double distance = Math.sqrt(Math.pow(origine.getX() - extremite.getX(), 2) + Math.pow(origine.getY() - extremite.getY(), 2));
        return distance;
    }

    void deplacerOrigine(double dx, double dy) {
        origine.setX(origine.getX() + dx);
        origine.setY(origine.getY() + dy);
        System.out.println("le nouveau origine ese" + "(" +origine.getX()+ "," + origine.getY()+")");
    }

    void deplacerExtremite(double dx, double dy) {
        extremite.setX(extremite.getX() + dx);
        extremite.setY(extremite.getY() + dy);
        System.out.println("le nouveau origine ese" + "(" +extremite.getX()+ "," + extremite.getY()+")");
    }

    void affiche() {
        origine.afficher();
        extremite.afficher();
    }
}
