package Screen;

import noise.PerlinNoise;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener
{
    private final GraphicDisplay gd;
    private final PerlinNoise pn;

    public Frame(PerlinNoise pn)
    {
        gd = new GraphicDisplay();
        this.pn = pn;
        this.add(gd);
        this.addKeyListener(this);
        this.pack();
        this.setTitle("Perlin Noise 1D");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Updates the values array in the graphics display class
     * @param values - array of new values to update
     */
    public void updateValues(float[] values)
    {
        gd.updateValues(values);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        switch (e.getKeyChar())
        {
            case 'o':
                pn.incrementOctave();
                gd.updateValues(pn.perlin1DNoise(16));
                break;
            case 's':
                gd.updateValues(pn.perlin1DNoise(16));
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
