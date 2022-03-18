package ma.education.tp2.introduction;

class Laboratoire extends Salle{
    String type;

    Laboratoire(String nom, String type) {
        super(nom);
        this.type = type;
    }
    Laboratoire(long id, String nom, String type) {
        super(id, nom);
        this.type = type;
    }
}
