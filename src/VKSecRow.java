import javax.swing.*;
import java.awt.*;

/**
 * This class represent the second row in the keyboard
 */
public class VKSecRow extends KeyboardRow {

    private static final String SHIFT = "Shift";

    @Override
    public void createRow() {
        PressedButton.ShiftButton shiftL = new PressedButton.ShiftButton(SHIFT);
        shiftL.setPreferredSize(new Dimension(LONG_KEY_WIDTH,LONG_KEY_HEIGHT));
        addButton(shiftL);
        this.addLetButton("z","Z");
        this.addLetButton("x","X");
        this.addLetButton("c","C");
        this.addLetButton("v","V");
        this.addLetButton("b","B");
        this.addLetButton("n","N");
        this.addLetButton("m","M");
        this.addSignButton(",","<");
        this.addSignButton(".",">");
        this.addSignButton("/","?");
        PressedButton.ShiftButton shiftR = new PressedButton.ShiftButton(SHIFT);
        shiftR.setPreferredSize(new Dimension(LONG_KEY_WIDTH,LONG_KEY_HEIGHT));
        addButton(shiftR);
    }

}
