package formation.entreprise.employe;

public abstract class Bureau extends Employe
{
    protected double chiffreAff;

    public Bureau(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE);
        this.chiffreAff = chiffreAff;
    }

    @Override
    public double calculerSalaire()
    {
        return (chiffreAff*20)/100;
    }
}
