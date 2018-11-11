package Chapter_16;

import javax.swing.*;

public class GameApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        setContentPane( new GamePanel());
    }
}
