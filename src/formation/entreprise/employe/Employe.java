package formation.entreprise.employe;

public abstract class Employe
{
    protected String annEE, nom, prenom;
    protected int age;

    public Employe(String prenom, String nom, int age, String annEE)
    {
        this.age = age;
        this.annEE = annEE;
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double calculerSalaire();

    public String getNom()
    {
        return "L'employé "+prenom+" "+nom+" ";
    }
}
