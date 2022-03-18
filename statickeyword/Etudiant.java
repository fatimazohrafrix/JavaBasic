package ma.education.tp2.statickeyword;

public class Etudiant {
    public long id;
    public String nom;
    static int nbEtudiants;

    public Etudiant (long id, String nom,int nb) {
        this.id = id;
        this.nom = nom;
        nbEtudiants+=nb;
    }

    // this method just for simplify displaying of the object
    public static void afficher(Etudiant etd) {
        System.out.print("Nom d'etudiant : " + etd.nom);
        System.out.print(" / Id d'etudiant : " + etd.id);
        System.out.println(" / nombre d'etudiant : " + nbEtudiants);
    }
}
