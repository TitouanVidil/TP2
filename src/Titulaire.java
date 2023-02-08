public abstract class Titulaire extends Prof
{
    protected String couleur;

    public Titulaire(String nom,double salaire,String couleur)
    {
        super(nom,salaire);
        this.couleur = couleur;
    }

    public String getCouleur()
    {
        return couleur;
    }

    public void setCouleur(String couleur)
    {
        this.couleur = couleur;
    }

    public abstract void setCouleurDefaut();
}
