package Chapter_16;

import javax.swing.*;

public class SimpleApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new DummiesPanel());
    }
}
