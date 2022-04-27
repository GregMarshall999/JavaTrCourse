package divers;

import java.util.Scanner;

public class TableauUtilite
{
    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        int age1, age2;
        double moyenne;

        System.out.println("Entrez l'age de l'utilisateur1: ");
        age1 = clavier.nextInt();

        System.out.println("Entrez l'age de l'utilisateur12 ");
        age2 = clavier.nextInt();

        moyenne = (age1 + age2) / 2.0f;
        System.out.println("La moyenne d'age est: " + moyenne);

    }
}
