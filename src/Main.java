import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        ArrayList<Humain> List =  new ArrayList<Humain>();
        Agrege a1 = new Agrege("Titouan",2000,"vert");
        List.add(a1);
        MaitreDeConference mdc1 = new MaitreDeConference("Gauthier",500,"orange");
        List.add(mdc1);

        for(Humain hum: List)
        {
            hum.meurt();
        }
    }
}