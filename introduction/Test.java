package ma.education.tp2.introduction;

public class Test {

    public static void main(String[] args) {
//        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle informatique");
        Salle o3 = new Salle(2,"Salle des cours");
        // Objet 1
//        System.out.println(o1.id);
//        System.out.println(o1.nom);
        // Objet 2
        System.out.println(o2.id);
        System.out.println(o2.nom);
        // Objet 3
        System.out.println(o3.id);
        System.out.println(o3.nom);
    }
}
