package formation.divers;

public class Player
{
    public String nom;
    private int posX;
    private int vie;

    public static int nbrPlayer; //Shared with all Player objects

    public Player(String nom)
    {
        this.nom = nom;
        nbrPlayer++;
        vie = 10;
    }

    public void hit()
    {
        vie--;
        //this.nom = "";
    }

    public boolean isDead()
    {
        return vie == 0;
    }

    public void marcher()
    {
        posX++;
    }

    public void marcher(int newPosX)
    {
        posX = newPosX;
    }
}
