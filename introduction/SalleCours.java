package ma.education.tp2.introduction;

class SalleCours extends Salle{
    byte nombrePlace;

    SalleCours(String nom, byte nombrePlace) {
        super(nom);
        this.nombrePlace = nombrePlace;
    }
    SalleCours(long id, String nom, byte nombrePlace) {
        super(id, nom);
        this.nombrePlace = nombrePlace;
    }
}
