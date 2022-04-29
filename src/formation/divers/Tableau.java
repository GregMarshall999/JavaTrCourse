package formation.divers;

import java.util.Scanner;

public class Tableau
{
    public static void main(String[] args)
    {
        int nbn, pos;
        float n5;
        float[] nl1, nl2;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Saisir le nombres de notes : ");
        nbn = clavier.nextInt();
        nl1 = new float[nbn];
        nl2 = new float[nbn+1];

        for(int i = 0; i < nbn; i++)
        {
            System.out.println("Note "+(i+1)+" : ");
            nl1[i] = clavier.nextFloat();
        }

        System.out.println("Saisir la note 5 : ");
        n5 = clavier.nextFloat();

        System.out.println("Saisir une position : ");
        pos = clavier.nextInt();

        int it=0;
        while(it<pos-1)
        {
            nl2[it] = nl1[it];
            it++;
        }
        nl2[it] = n5;
        it++;
        while(it<nl2.length)
        {
            nl2[it] = nl1[it-1];
            it++;
        }

        System.out.println("Donnée de sortie: ");
        System.out.print("[");
        for(int i = 0 ; i<nl2.length; i++)
        {
            if(i==0)
                System.out.print(nl2[i]);
            else
                System.out.print(", "+nl2[i]);
        }
        System.out.println("]");
    }
}
