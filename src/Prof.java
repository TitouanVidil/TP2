public class Prof extends Humain
{
    protected double salaire;

    public Prof(String nom)
    {
        super(nom);
    }

    public Prof(String nom,double saliare)
    {
        super(nom);
        this.salaire = salaire;
    }

    public double getSalaire()
    {
        return salaire;
    }

    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
