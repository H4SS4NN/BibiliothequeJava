import java.util.ArrayList;

public class Bibliotheque {

    private String NomBibliotheque;
    private String ISBN;
    private ArrayList<Livre> livre;
    public Bibliotheque() {
        this.livre = new ArrayList<>();
    }
    public void ajouterUnLivre(Livre livre) {
        this.livre.add(livre);
        for (Livre livre1 : this.livre) {
            System.out.println(livre1.getAuteur());
            System.out.println(livre1.getTitre());
            System.out.println(livre1.getAnneePublication());
            System.out.println(livre1.getISBN());
        }
    }

    public String getNomBibliotheque() {
        return NomBibliotheque;
    }

    public void setNomBibliotheque(String nomBibliotheque) {
        NomBibliotheque = nomBibliotheque;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Livre> getLivre() {
        return this.livre;
    }

    public void setLivre(ArrayList<Livre> livre) {
        this.livre = livre;
    }
}
