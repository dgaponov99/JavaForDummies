package Chapter_14;

import Chapter_14.frames.ArtFrame;

public class ShowFrame {

    public static void main(String[] args) {
        ArtFrame artFrame = new ArtFrame(new DrawingWide());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
