package ma.education.tp2.reflection;

import ma.education.tp2.introduction.Salle;

public class TestReflection {
    public static void main(String[] args) {
        Salle s1 = new Salle(1, "Salle 1");
        System.out.println(s1.id + " " + s1.nom);
        //-------------------------------------------
        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2, "Salle des cours");
        System.out.println("o2 " + (o2.equals(o3) ? "":"doesn't ") + "equals o3");
        System.out.println("o2 " + (o2.equals(o1) ? "":"doesn't ") + "equals o1");

    }
}
