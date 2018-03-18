import java.awt.*;

/**
 * This class represent the fourth row in the keyboard
 */
public class VKFourthRow extends KeyboardRow{

    private static final String TAB_TIT = "Tab";
    private static final String TAB = "\t";


    @Override
    public void createRow() {
        ChangeButton.SignButton tab = new ChangeButton.SignButton (TAB_TIT, TAB,TAB);
        tab.setPreferredSize(new Dimension(LONG_KEY_WIDTH,LONG_KEY_HEIGHT));
        addButton(tab);
        this.addLetButton("q","Q");
        this.addLetButton("w","W");
        this.addLetButton("e","E");
        this.addLetButton("r","R");
        this.addLetButton("t","T");
        this.addLetButton("y","Y");
        this.addLetButton("u","U");
        this.addLetButton("i","I");
        this.addLetButton("o","O");
        this.addLetButton("p","P");
        this.addSignButton("[","{");
        this.addSignButton("]","}");
        this.addSignButton("\\","|");
    }
}
