package formation.entreprise.employe;

public class Vendeur extends Bureau
{
    public Vendeur(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE, chiffreAff);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 400;
    }

    @Override
    public String getNom()
    {
        return "Le vendeur " + this.prenom + " " + this.nom + " ";
    }
}
