import javax.swing.*;

/**
 * This class represent virtual keyboard app
 */
public class VirtualKeyboard {

    public static final int DEFAULT_H_FRAME_SIZE = 400;
    public static final int DEFAULT_W_FRAME_SIZE = 800;

    public VirtualKeyboard(){
        JFrame app = new JFrame();
        KeyGraphic frame = new KeyGraphic();
        app.add(frame);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(DEFAULT_W_FRAME_SIZE, DEFAULT_H_FRAME_SIZE);
        app.setVisible(true);
    }

    public static void main(String[]args){
        new VirtualKeyboard();
    }
}
