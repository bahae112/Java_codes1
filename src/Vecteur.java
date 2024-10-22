import java.util.Vector;
public class Vecteur {
    public double[] composants;
    public Vecteur(){
        for( int i = 0 ; i < composants.length ; i++){
            composants[i] = 0;
        }
    }
    public Vecteur(int n){
        composants = new double[n];
    }
    public Vecteur( int n , double x){
        for(int i = 0; i<n; i++){
            composants[i] = x;
        }
    }
    public Vecteur(double[] v){   // constructeur de recopie
        this.composants =  new double[v.length];
        System.arraycopy(v,0, this.composants, 0, v.length);
    }
    double produitScalaire(Vecteur v1, Vecteur v2){
        if(v1.composants.length == v2.composants.length){
            double somme = 0;
            for(int i = 0; i<v1.composants.length; i++){
                somme += v1.composants[i] * v2.composants[i];
            }
            return somme;
        }else{
            return 0;
        }
    }
    public static Vecteur somme(Vecteur v1, Vecteur v2){
        if(v1.composants.length == v2.composants.length){
            Vecteur v = new Vecteur(v1.composants.length);
            for(int i = 0; i<v1.composants.length; i++){
                v.composants[i] = v1.composants[i] + v2.composants[i];
            }
            return v;
        }else{
            return null;
        }
    }
    void afficher(){
        for( int i = 0 ; i < composants.length ; i++){
            System.out.println("les composants de V sont  : " + composants[i]);
        }
    }
}
