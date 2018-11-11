package Chapter_9;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        setTitle("Не щелкайте на кнопку!");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Щелкните на меня!"));
        setSize(300, 100);
        setVisible(true);
    }
}
