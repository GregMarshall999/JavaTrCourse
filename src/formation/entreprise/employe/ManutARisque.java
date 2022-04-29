package formation.entreprise.employe;

public class ManutARisque extends Manutentionnaire implements ARisque
{
    public ManutARisque(String prenom, String nom, int age, String annEE, int heureTr) {
        super(prenom, nom, age, annEE, heureTr);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 200;
    }
}
