import Screen.Frame;
import noise.PerlinNoise;

public class Main
{
    public static void main(String[] args)
    {
        PerlinNoise pn = new PerlinNoise(16);
        Frame f = new Frame(pn);

        f.updateValues(pn.perlin1DNoise(16));
    }
}
