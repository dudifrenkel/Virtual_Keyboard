import java.awt.*;

/**
 * This class represent the first row in the virtual keyboard
 */
public class VKFirstRow extends KeyboardRow {
    public static final String SPACE = " ";

    @Override
    public void createRow(){
        ChangeButton.SignButton space = new ChangeButton.SignButton("",SPACE,SPACE);
        space.setPreferredSize(new Dimension(LONG_KEY_WIDTH*3, LONG_KEY_HEIGHT));
        this.addButton(space);
    }

}
