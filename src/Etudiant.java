public class Etudiant extends Humain
{
    private double note;

    public Etudiant(String nom,double note)
    {
        super(nom);
        this.note = note;
    }

    public double getNote()
    {
        return note;
    }

    public void setNote(double note)
    {
        this.note = note;
    }

    public void meurt()
    {
       System.out.println("L'Etudiant: "+nom+" est mort");
    }
}
