package formation.entreprise.employe;

public class Manutentionnaire extends Employe
{
    private final int heureTr;

    public Manutentionnaire(String prenom, String nom, int age, String annEE, int heureTr)
    {
        super(prenom, nom, age, annEE);
        this.heureTr = heureTr;
    }

    @Override
    public double calculerSalaire()
    {
        return heureTr * 65;
    }

    @Override
    public String getNom()
    {
        return "Le manut. " + prenom + " " + nom + " ";
    }
}
