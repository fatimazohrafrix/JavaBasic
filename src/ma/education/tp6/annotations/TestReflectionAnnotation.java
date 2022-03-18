package ma.education.tp6.annotations;

public class TestReflectionAnnotation {
    public static void main(String[] args) {
        Class c = Calculatrice.class;
        Programmer prog = (Programmer) c.getDeclaredAnnotation(Programmer.class);

        Class c2 = CalculatriceMath.class;
        Programmer prog2 = (Programmer) c2.getAnnotation(Programmer.class);

        System.out.println(prog.id()+":"+prog.name());

        System.out.println(prog2.id()+":"+prog2.name());
    }
}
