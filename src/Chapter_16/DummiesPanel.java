package Chapter_16;

import javax.swing.*;
import java.awt.*;

public class DummiesPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics myGraphics) {
        myGraphics.drawRect(50, 60, 250, 75);
        myGraphics.setFont(new Font("Dialog", Font.BOLD, 24));
        myGraphics.drawString("Java для чайников", 55, 100);
    }
}
