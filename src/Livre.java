import java.util.Scanner;

public class Livre {
        private String titre ;
        private String auteur ;
        private int anneePublication ;
        private String ISBN ;

        public Livre() {

        }

        public  void creationLivre(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the titre : ");
                this.titre = scanner.next();
                System.out.println("enter the auteur : ");
                this.auteur = scanner.next();
                System.out.println("enter the anneePublication : ");
                this.anneePublication = scanner.nextInt();
                System.out.println("enter the ISBN : ");
                this.ISBN = scanner.next();

        }

        public String getTitre() {
                return titre;
        }

        public void setTitre(String titre) {
                this.titre = titre;
        }

        public String getAuteur() {
                return auteur;
        }

        public void setAuteur(String auteur) {
                this.auteur = auteur;
        }

        public int getAnneePublication() {
                return anneePublication;
        }

        public void setAnneePublication(int anneePublication) {
                this.anneePublication = anneePublication;
        }

        public String getISBN() {
                return ISBN;
        }

        public void setISBN(String ISBN) {
                this.ISBN = ISBN;
        }
}
