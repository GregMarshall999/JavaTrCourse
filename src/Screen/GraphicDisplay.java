package Screen;

import javax.swing.JPanel;
import java.awt.*;

public class GraphicDisplay extends JPanel
{
    private final int offset = 50;

    private int colWidth;
    private final int[] xp = new int[4] , yp = new int[4];
    private float[] values;

    public GraphicDisplay()
    {
        this.setPreferredSize(new Dimension(500, 500));
        colWidth = 0;
    }

    public void paint(Graphics gBase)
    {
        float temp;
        Graphics2D g = (Graphics2D) gBase;
        
        g.setPaint(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setPaint(new Color(21, 111, 21));

        for(int x = 0; x < values.length-1; x++)
        {
            xp[0] = x*colWidth + offset;
            xp[1] = (x+1)*colWidth + offset;
            xp[2] = xp[1];
            xp[3] = xp[0];

            yp[0] = 400;
            yp[1] = yp[0];
            temp = values[x+1]*200;
            yp[2] = 400 - (int)temp;
            temp = values[x]*200;
            yp[3] = 400 - (int)temp;

            g.fillPolygon(xp, yp, 4);
        }
    }

    public void updateValues(float[] values)
    {
        this.values = values;
        colWidth = (getWidth()-2*offset)/values.length;
        repaint();
    }
}
