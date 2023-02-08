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

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public abstract void meurt(Humain humain);
}
