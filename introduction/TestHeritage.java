package ma.education.tp2.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1 = new SalleCours(1, "Salle 1", (byte)20);
        SalleCours s2 = new SalleCours(2, "Salle 2", (byte)20);
        SalleCours s3 = (SalleCours)s1; //we should to cast this class to assign into s3
        SalleCours s4 = s2;
        Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
        SalleCours s6= new SalleCours(2, "Salle 2", (byte) 20);
        SalleCours s7= (SalleCours) s5; // we can't assign this class even if we cast it cause of s5 has another inherited class "Laboratoire"
        SalleCours s8=s6;

    }
}
