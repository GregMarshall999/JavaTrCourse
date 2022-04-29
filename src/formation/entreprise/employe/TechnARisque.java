package formation.entreprise.employe;

public class TechnARisque extends Technicien implements ARisque
{
    public TechnARisque(String prenom, String nom, int age, String annEE, int nUnite) {
        super(prenom, nom, age, annEE, nUnite);
    }

    @Override
    public double calculerSalaire()
    {
        return super.calculerSalaire() + 200;
    }
}
