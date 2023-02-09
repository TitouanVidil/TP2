public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Agrege a1 = new Agrege("Titouan",2000,"vert");
        System.out.println(a1.getNom());
        System.out.println(a1.getSalaire());
        System.out.println(a1.getCouleur());
        a1.setCouleurDefaut();
        System.out.println(a1.getCouleur());
        a1.meurt();
    }
}