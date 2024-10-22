import java.util.Vector;
public class UtilTab {
    private double[] tab;

    // Constructeur pour initialiser le tableau
    public UtilTab(double[] tab) {
        this.tab = tab;
    }

    // Méthode pour calculer la somme des éléments du tableau
    public double somme() {
        double m_index = 0;
        for (int i = 0; i < tab.length; i++) {
            m_index += tab[i];
        }
        return m_index;
    }

    // Méthode pour incrémenter chaque élément du tableau
    public void incre(double r) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += r;
        }
    }

    // Méthode pour générer un tableau d'éléments impairs
    public double[] genere(int n) {
        double[] tab1 = new double[n];
        int j = 0;

        for (int i = 0; i < tab.length && j < n; i++) {
            if (tab[i] % 2 == 1) {
                tab1[j] = tab[i];
                j++;
            }
        }

        // Redimensionner tab1 si moins d'éléments ont été ajoutés
        if (j < n) {
            double[] result = new double[j];
            System.arraycopy(tab1, 0, result, 0, j);
            return result;
        }
        return tab1; // Retourner tab1 si la taille est correcte
    }
    public static Vector<Integer> somme2(Vector<Integer> vect1 , Vector<Integer> vect2){
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < vect1.size(); i++) {
            result.add(vect1.get(i) + vect2.get(i)); ;
        }
        return vect1;
    }
}
