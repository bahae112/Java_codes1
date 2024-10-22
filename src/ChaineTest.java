public class ChaineTest {
    private String chaine;
    public ChaineTest(String chaine) {
        this.chaine = chaine ;
    }
    public void VerticalChaine(){
        for( int i = 0 ; i < chaine.length() ; i++ ){
            System.out.println( chaine.charAt(i));
        }
    }
    public void NumberChaine( int n ){
        String ch = "";
        for( int i = 0 ; i < n ; i++ ){
            ch += i ;
        }
        System.out.println( ch );
    }
    public void longchaine(){
        int i = 0 ;

    }
}
