package formation.divers;

public class Triangle extends Forme
{
    protected double base = 4;
    protected double hauteur = 3;

    public Triangle()
    {

    }

    @Override
    public double aire() {
        return (base * hauteur)/2;
    }
}
