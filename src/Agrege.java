public class Agrege extends Titulaire
{
    public Agrege(String nom,double salaire,String couleur)
    {
        super(nom,salaire,couleur);
    }

    public void setCouleurDefaut()
    {
        couleur = "bleu";
    }
}
