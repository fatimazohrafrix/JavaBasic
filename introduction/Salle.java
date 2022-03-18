package ma.education.tp2.introduction;

public class Salle {
    public long id;
    public String nom;

    public Salle() {}

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // overload this method
    public boolean equals(Salle obj) {
        return this.id == obj.id ? true : false;
    }

}
