package formation.entreprise.employe;

import java.util.ArrayList;
import java.util.List;

public class Personnel
{
    private final List<Employe> p;

    public Personnel()
    {
        p = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e)
    {
        p.add(e);
    }

    public void afficherSalaires()
    {
        for(Employe e : p)
        {
            System.out.println(e.getNom() + "gagne " + e.calculerSalaire() + " Euros.");
        }
    }

    public double salaireMoyen()
    {
        double sal = 0;
        for(Employe e : p)
        {
            sal += e.calculerSalaire();
        }
        return sal / p.size();
    }
}
