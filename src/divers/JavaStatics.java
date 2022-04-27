package divers;

public class JavaStatics
{
    //Cette variable n'a pas de valeurs
    static int jeSuisStatic;

    public static void main(String[] args)
    {
        /*UneClass uc = new UneClass();

        int pasStatic = 4;

        System.out.println(pasStatic + ": Je suis pasStatic de main");
        System.out.println(uc.getPasStatic() + ": Je suis pasStatic de UneClass");

        System.out.println(jeSuisStatic);


        double absolu = Math.abs(-4.0);
        System.out.println(absolu);*/

        System.out.println(sumDouble(3, 3));
    }

    public static int sumDouble(int a, int b) {
        boolean bool = a==b;
        int select = bool ? 1 : 0;
        return select*((a+b)*2) + (1-select)*(a+b);
    }
}
