package formation.divers;

import java.awt.*;

public enum CouleursYeux
{
    BLEU(new Color(0, 0, 255)),
    VERT(new Color(0, 255, 0)),
    MARRON(new Color(138, 83, 5)),
    ROUGE(new Color(255, 0, 0));

    private Color c;

    CouleursYeux(Color c)
    {

    }

    public Color getC()
    {
        return c;
    }
}
