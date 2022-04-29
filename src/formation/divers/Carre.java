package formation.divers;

public class Carre extends Forme
{
    public Carre()
    {
        super();
    }

    @Override
    public double aire()
    {
        return this.cote * this.cote;
    }
}
