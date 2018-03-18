import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class represent row in the keyboard
 */
public abstract class KeyboardRow extends JPanel {

    public static final int LONG_KEY_WIDTH = 100;
    public static final int LONG_KEY_HEIGHT = 26;
    public static final int SPACE_BW_BUTTONS = 5;

    private ArrayList<JButton> buttonsArr;

    KeyboardRow(){
        super();
        buttonsArr = new ArrayList<>();
        this.setLayout(new FlowLayout(FlowLayout.CENTER,SPACE_BW_BUTTONS,SPACE_BW_BUTTONS));
    }

    public void addLetButton(String first, String sec){
        ChangeButton.LetButton button = new ChangeButton.LetButton(first,sec);
        this.addButton(button);
    }

    public void addSignButton(String first, String sec){
        ChangeButton.SignButton button = new ChangeButton.SignButton(first,sec);
        this.addButton (button );
    }

    /**
     * This method add button to the panel and to his buttonsArr
     */
    public void addButton (JButton button){
        this.add(button);
        buttonsArr.add(button);
    }

    /**
     * @return The buttons list
     */
    public ArrayList<JButton> getButtonsArr(){
        return this.buttonsArr;
    }

    /**
     * This method create the row of the virtual keyBoard
     */
    public abstract void createRow();


//    public class LetterKeyButton extends JButton{
//        boolean caps;
//
//        LetterKeyButton(String let){
//            super(let);
//            caps = false;
//        }
//
//        public void changeCaps(){
//            if (this.caps){
//                setText(getText().toLowerCase());
//                this.caps = false;
//            }
//            else {
//                setText(getText().toUpperCase());
//                this.caps = true;
//            }
//        }
//    }
//
//    public static class SignKeyButton extends JButton{
//        boolean shift;
//
//        LetterKeyButton(String let){
//            super(let);
//            shift = false;
//        }
//
//        public void changeShift(){
//            if (this.shift){
//                setText(getText().toLowerCase());
//                this.shift = false;
//            }
//            else {
//                setText(getText().toUpperCase());
//                this.caps = true;
//            }
//        }
//    }
}
