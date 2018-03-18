import javax.swing.*;
import java.awt.*;

/**
 * This class represent pressable button that show if it's pressed
 */
public abstract class PressedButton extends JButton {

    private static Color defColor;

    PressedButton(String t) {
        super(t);
        defColor = this.getBackground();
    }

    /**
     * change the color of the button's background according to the 'isPressed' variable
     * @param isPressed true if the button is on "press" mode false otherwise
     */
    public void changeBG(boolean isPressed) {
        if (isPressed) {
            this.setBackground(Color.GRAY);
        } else {
            this.setBackground(defColor);
        }
    }

    /**
     * This class represent shift button
     */
    public static class ShiftButton extends PressedButton {
        ShiftButton(String t){
            super(t);
        }
    }

    /**
     * this class represent caps button
     */
    public static class CapsButton extends PressedButton {
        CapsButton(String t){
            super(t);
        }
    }
}