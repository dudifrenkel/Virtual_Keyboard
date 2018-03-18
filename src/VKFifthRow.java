/**
 * This class represent the fifth row in the keyboard
 */
public class VKFifthRow extends KeyboardRow {

    @Override
    public void createRow() {
        this.addSignButton("`","~");
        this.addSignButton("1","!");
        this.addSignButton("2","@");
        this.addSignButton("3","#");
        this.addSignButton("4","$");
        this.addSignButton("5","%");
        this.addSignButton("6","^");
        this.addSignButton("7","&");
        this.addSignButton("8","*");
        this.addSignButton("9","(");
        this.addSignButton("0",")");
        this.addSignButton("-","_");
        this.addSignButton("=","+");
    }

}