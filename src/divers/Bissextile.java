package divers;

public class Bissextile
{
    public Bissextile()
    {}

    public static String isBissextile(int annee)
    {
        boolean b = annee >= 0 && (annee%4 == 0 && annee%100 != 0 || annee%400 == 0);
        return b ? "Bis" : "nonBis";
    }

    public static void main(String[] args)
    {
        System.out.println(Bissextile.isBissextile(2000));
    }
}
