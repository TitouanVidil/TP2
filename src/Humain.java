public class Humain implements Mortel
{
    protected String nom;

    public Humain(){}

    public Humain(String nom)
    {
        this.nom = nom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom){ this.nom = nom;}

    public void meurt()
    {
        System.out.println("L'Humain: "+nom+" est mort");
    }
}
