import java.awt.*;

/**
 * This class represent the second row in the keyboard
 */
public class VKThirdRow extends KeyboardRow {

    private static final String ENTER = "Enter";
    private static final String CAPS = "Caps";
    private static final String NEW_LINE = "\n";

    @Override
    public void createRow() {
        PressedButton.CapsButton caps = new PressedButton.CapsButton(CAPS);
        caps.setPreferredSize(new Dimension(LONG_KEY_WIDTH,LONG_KEY_HEIGHT));
        addButton(caps);
        this.addLetButton("a","A");
        this.addLetButton("s","S");
        this.addLetButton("d","D");
        this.addLetButton("f","F");
        this.addLetButton("g","G");
        this.addLetButton("h","H");
        this.addLetButton("j","J");
        this.addLetButton("k","K");
        this.addLetButton("l","L");
        this.addSignButton(";",":");
        this.addSignButton("'","\"");
        ChangeButton.SignButton enter = new ChangeButton.SignButton(ENTER, NEW_LINE,NEW_LINE);
        enter.setPreferredSize(new Dimension(LONG_KEY_WIDTH,LONG_KEY_HEIGHT));
        enter.setActionCommand(NEW_LINE);
        addButton(enter);

    }

}
