import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class represent Virtual keyboard panel
 */
public class KeyGraphic extends JPanel implements ActionListener{

    /* Constants */
    public static final int FIRST_ROW_PL = 0;
    public static final int SEC_ROW_PL = 1;
    public static final int THI_ROW_PL = 2;
    public static final int FOUR_ROW_PL = 3;
    public static final int FIF_ROW_PL = 4;
    public static final String BACKSPACE = "Backspace";
    public static final int NUM_OF_VK_ROWS = 5;

    private KeyboardRow[] KBRows;
    private JTextArea textArea;
    private ArrayList<JButton> buttonsArr;
    private ArrayList<ChangeButton.LetButton> letArr;
    private ArrayList<ChangeButton.SignButton> signArr;
    private ArrayList<PressedButton.ShiftButton> shiftArr = new ArrayList<>();
    private PressedButton.CapsButton caps;
    private JButton backSpace;
    private boolean isShiftPressed;
    private boolean isCapsPressed;

    public KeyGraphic(){
        super();

        KBRows = new KeyboardRow[5];
        JPanel keyboardPanel = new JPanel(new GridLayout(5,1,5,5));

        this.buttonsArr = new ArrayList<>();
        this.letArr = new ArrayList<>();
        this.signArr = new ArrayList<>();
        this.shiftArr = new ArrayList<>();
        this.setLayout(new GridLayout(2,1));
        this.isShiftPressed = false;
        this.isCapsPressed = false;

        this.backSpace = new JButton(BACKSPACE);
        backSpace.setPreferredSize(new Dimension(KeyboardRow.LONG_KEY_WIDTH,KeyboardRow.LONG_KEY_HEIGHT));
        textArea = new JTextArea();
        this.add(textArea,BorderLayout.NORTH);

        for (int i = NUM_OF_VK_ROWS-1; i>=0; i--){              //creates the rows and add them to keyboard panel
            switch (i){
                case FIRST_ROW_PL: KBRows[FIRST_ROW_PL] = new VKFirstRow();
                    break;
                case SEC_ROW_PL: KBRows[SEC_ROW_PL] = new VKSecRow();
                    break;
                case THI_ROW_PL: KBRows[THI_ROW_PL] = new VKThirdRow();
                    break;
                case FOUR_ROW_PL: KBRows[FOUR_ROW_PL] = new VKFourthRow();
                    break;
                case FIF_ROW_PL: KBRows[FIF_ROW_PL] = new VKFifthRow();
                    break;
            }
            KBRows[i].createRow();
            keyboardPanel.add(KBRows[i]);
        }

        KBRows[FIF_ROW_PL].add(backSpace);                      //  add the button 'Backspace' to the fifth row
        this.add(keyboardPanel,BorderLayout.SOUTH);             //  add the keyboard panel to this panel

        for (KeyboardRow row:KBRows) {                          //  add all the buttons to arrayList
            this.buttonsArr.addAll(row.getButtonsArr());
        }
        this.buttonsArr.add(backSpace);


        for (JButton button:buttonsArr) {                       //  Add each button to the correct arrayList for better
            if (button instanceof ChangeButton.SignButton){     //  handling and add this listener
                signArr.add((ChangeButton.SignButton)button);
            }
            if (button instanceof ChangeButton.LetButton){
                letArr.add((ChangeButton.LetButton)button);
            }
            if (button instanceof PressedButton.ShiftButton){
                shiftArr.add((PressedButton.ShiftButton) button);
            }
            if (button instanceof PressedButton.CapsButton){    // got only one caps
                this.caps = (PressedButton.CapsButton)button;
            }
          button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof ChangeButton) {                    // handle "regular" buttons
            this.textArea.append(e.getActionCommand());
        }

        if (e.getSource() instanceof PressedButton) {
            if (e.getSource() instanceof PressedButton.ShiftButton) {   // Shift was pressed
                isShiftPressed = !isShiftPressed;
                for (PressedButton.ShiftButton sB : shiftArr) {
                    sB.changeBG(isShiftPressed);
                }
                for (JButton b : signArr) {
                    ((ChangeButton.SignButton) b).changeSit(isShiftPressed);
                    repaint();
                }
            } else {                                                    // Caps was pressed
                isCapsPressed = !isCapsPressed;
                caps.changeBG(isCapsPressed);
                for (ChangeButton.LetButton b : letArr) {
                    b.changeSit(isCapsPressed);
                    repaint();
                }
            }
        }
        if (e.getSource()==backSpace){                                  // handle Backspace
            String text = textArea.getText();
            if (text.length()>0){
                textArea.replaceRange(text.substring(0,text.length()-1),0,text.length());
            }
        }
    }
}
