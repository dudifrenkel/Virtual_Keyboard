import javax.swing.*;

/**
 * This class represent button that change is condition according to press
 */
public class ChangeButton extends JButton {

    public static final String NO_TITLE = null;
    String first;
    String second;
    String title;

    /**
     * @param first the first sign/letter the button represent
     * @param sec the second sign/letter the button represent
     */
    ChangeButton(String first,String sec){
        super(first);
        this.first = first;
        this.second = sec;
        this.title = NO_TITLE;
    }

    /**
     * @param title the title we want on the button regardless to printed sign - for ENTER & TAB
     */
    ChangeButton(String title, String first, String sec){
        super(title);
        this.first = first;
        this.second = sec;
        this.title = title;
        setActionCommand(first);
    }

    /**
     * This method changed the button to be the second option
     */
    public void changeSit(boolean sit) {
        if (title == NO_TITLE) {
            if (sit) {
                setText(this.second);
            } else {
                setText(this.first);
            }
        }
    }

    /**
     * represent a letter button in the virtual keyboard
     */
    public static class LetButton extends ChangeButton {

        /**
         * @param first the first sign the button represent
         * @param sec   the second sign the button represent
         */
        LetButton(String first, String sec) {
            super(first, sec);
        }
    }

    /**
     * represent a sign button in the virtual keyboard
     */
    public static class SignButton extends ChangeButton{

        SignButton(String first, String sec) {
            super(first, sec);
        }
        SignButton(String tit, String first, String sec) {
            super(tit, first, sec);
        }
    }
}

