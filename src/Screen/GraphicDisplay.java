package Screen;

import noise.kenperlin.PerlinNoise;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraphicDisplay extends JPanel
{
    private final PerlinNoise pn;
    private final double noiseRange;
    //private int dimension;
    private float z, zoom, offsetX, offsetY;

    public GraphicDisplay()
    {
        this.setPreferredSize(new Dimension(800, 800));
        pn = new PerlinNoise(254);
        //dimension = 2;
        noiseRange = 1.0;
        z = 0.0f;
        zoom = 1.0f;
        offsetX = 0.0f;
        offsetY = 0.0f;
    }

    public void shiftDown()
    {
        offsetY+=.1;
    }

    public void shiftLeft()
    {
        offsetX-=.1;
    }

    public void shiftRight()
    {
        offsetX+=.1;
    }

    public void shiftUp()
    {
        offsetY-=.1;
    }

    /**
     * Zoom out noise display
     */
    public void zoomOut()
    {
        zoom -=1.0f;
        if(zoom<=0.0f)
            zoom = 1.0f;
    }

    /**
     * Zoom noise display
     */
    public void zoomIn()
    {
        zoom +=1.0f;
    }

    public void paint(Graphics gBase)
    {
        Graphics2D g = (Graphics2D) gBase;
        int itX = 0;
        int itY = 0;

        g.setPaint(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        for(float y = 0.0f; y < this.getHeight()/ zoom - 1.0f/ zoom; y+=1.0f/ zoom) {
            for (float x = 0.0f; x < this.getWidth()/ zoom - 1.0f/ zoom; x += 1.0f/ zoom) {

                double noise = pn.noise(x+offsetX, y+offsetY, z);
                if(noise <= 0.0)
                {
                    g.setPaint(new Color(   normalizeNeg(noise, -noiseRange, 0.0, 39),
                                            normalizeNeg(noise, -noiseRange, 0.0, 47),
                                            normalizeNeg(noise, -noiseRange, 0.0, 248)));
                }
                else
                {
                    g.setPaint(new Color(   normalizeNeg(noise, -noiseRange, noiseRange, 90),
                                            normalizeNeg(noise, -noiseRange, noiseRange, 236),
                                            normalizeNeg(noise, -noiseRange, noiseRange, 57)));
                }
                g.fillRect(itX, itY, 1, 1);
                itX++;
            }
            itX=0;
            itY++;
        }
        z+=.01f;
        repaint();
    }

    public static int normalizeNeg(double value, double min, double max, double newMax)
    {
        double d = ((value + Math.abs(min))*newMax)/(max + Math.abs(min));
        return (int)d;
    }
}
