public abstract class Humain extends Mortel
{
    protected String nom;

    public Humain(String nom)
    {
        this.nom = nom;
    }

    public String getNom()
    {
        return nom;
    }

    abstract public void setNom(String nom);

    public void meurt()
    {
        System.out.println("L'Humain: "+nom+" est mort");
    }
}
