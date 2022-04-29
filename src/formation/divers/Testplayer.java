package formation.divers;

import java.util.ArrayList;
import java.util.List;

public class Testplayer
{
    public static void main(String[] args)
    {
        List<Player> lp = new ArrayList<>();

        Player p1 = new Player("Jackes");
        Player p2 = new Player("Charlie");

        String test = p1.nom;

        System.out.println(Player.nbrPlayer);
    }
}
