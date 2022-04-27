package divers;

import java.util.ArrayList;
import java.util.List;

public class Tuple
{
    private final List<Object> tl;

    public Tuple(boolean b1, boolean b2)
    {
        tl = new ArrayList<>();
        tl.add(b1);
        tl.add(b2);
    }

    public Tuple(short s1, short s2)
    {
        tl = new ArrayList<>();
        tl.add(s1);
        tl.add(s2);
    }

    public boolean getFirstBool()
    {
        return (boolean)tl.get(0);
    }

    public boolean getLastBool()
    {
        return (boolean)tl.get(tl.size()-1);
    }
}
