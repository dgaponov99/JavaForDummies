package Chapter_14.frames;

import Chapter_14.drawings.Drawing;

import javax.swing.*;
import java.awt.*;

public class ArtFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private Drawing drawing;

    public ArtFrame(Drawing drawing) {
        this.drawing = drawing;
        setTitle("Произведение абстрактного искусства");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        drawing.paint(g);
    }
}
