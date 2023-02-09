public class Prof extends Humain
{
    protected double salaire;

    public Prof(){}

    public Prof(String nom)
    {
        super(nom);
    }

    public Prof(String nom,double salaire)
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

    @Override
    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
