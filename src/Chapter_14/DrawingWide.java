package Chapter_14;

import Chapter_14.drawings.Drawing;

import java.awt.*;

public class DrawingWide extends Drawing {
    int width = 100, height = 30;

    @Override
    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
