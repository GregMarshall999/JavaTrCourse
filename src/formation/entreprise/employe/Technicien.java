package formation.entreprise.employe;

public class Technicien extends Employe
{
    private final int nUnite;

    public Technicien(String prenom, String nom, int age, String annEE, int nUnite)
    {
        super(prenom, nom, age, annEE);
        this.nUnite = nUnite;
    }

    @Override
    public double calculerSalaire()
    {
        return nUnite * 5;
    }

    @Override
    public String getNom()
    {
        return "Le technicien " + prenom + " " + nom + " ";
    }
}
