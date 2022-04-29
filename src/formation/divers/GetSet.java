package formation.divers;

public class GetSet
{
    public int health;
    private int safeHealth;

    public GetSet()
    {
        health = 10;
        safeHealth = health;
    }

    public int getSafeHealth()
    {
        return safeHealth;
    }

    public void addHealth()
    {
        health++;
        safeHealth++;

        if(safeHealth >= 10)
        {
            safeHealth = 10;
        }
    }

    public void supHealth()
    {
        health--;
        safeHealth--;

        if(safeHealth < 0 || health < 0)
        {
            health = 0;
            safeHealth = 0;
        }
    }
}
