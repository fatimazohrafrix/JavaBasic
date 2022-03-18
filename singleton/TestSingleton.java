package ma.education.tp2.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);
        System.out.println("Terre 1 : "+ t1.distanceToSoleil +" distance au soleil, "+ t1.surface + " surface");
        System.out.println("Terre 2 : "+ t2.distanceToSoleil +" distance au soleil, "+ t2.surface + " surface");
    }
}
