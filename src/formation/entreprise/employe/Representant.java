package formation.entreprise.employe;

public class Representant extends Bureau
{
    public Representant(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE, chiffreAff);
    }

    @Override
    public double calculerSalaire()
    {
        return super.calculerSalaire() + 800;
    }

    @Override
    public String getNom()
    {
        return "Le représentant " + prenom + " " + nom + " ";
    }
}
