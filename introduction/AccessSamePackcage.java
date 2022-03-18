package ma.education.tp2.introduction;

public class AccessSamePackcage {
    public static void main(String[] args){
        Salle salleA = new Salle(1, "Salle A");
        System.out.println(salleA.id+" "+salleA.nom);
    }
}
