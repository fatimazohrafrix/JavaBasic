package ma.education.tp2.statickeyword;

public class TestStatic {
    public static  void main(String[] args) {
        Etudiant e1= new Etudiant(1, "AHMED", 20);
        Etudiant e2= new Etudiant(2, "SAID", 30);

        Etudiant.afficher(e1);
        Etudiant.afficher(e2);

    }
}
