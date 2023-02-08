public class MaitreDeConference extends Titulaire
{
    public MaitreDeConference(String nom,double salaire,String couleur)
    {
        super(nom,salaire,couleur);
    }

    public void setCouleurDefaut()
    {
        couleur = "rouge";
    }
}
