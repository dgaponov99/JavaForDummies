package Chapter_16;

import javax.swing.*;
import java.awt.*;

public class OdometerPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    long hitCount = 239472938472L;

    @Override
    public void paint(Graphics myGraphics) {
        myGraphics.setFont(new Font("Monospaced", Font.BOLD, 24));
        myGraphics.drawString("Вы - посетитель №" + Long.toString(hitCount++), 50, 50);
    }
}
