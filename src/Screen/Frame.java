package Screen;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener
{
    private final GraphicDisplay gd;

    public Frame()
    {
        super();
        gd = new GraphicDisplay();
        this.add(gd);
        this.addKeyListener(this);
        this.pack();
        this.setTitle("Perlin Noise");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        switch (e.getKeyChar())
        {
            case '+':
                gd.zoomIn();
                break;
            case '-':
                gd.zoomOut();
                break;
            case '2':
                gd.shiftDown();
                break;
            case '4':
                gd.shiftLeft();
                break;
            case '6':
                gd.shiftRight();
                break;
            case '8':
                gd.shiftUp();
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
