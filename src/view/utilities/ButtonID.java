package view.utilities;

import utilities.IdGUI;

import javax.swing.*;

public class ButtonID extends JButton {
    private IdGUI currentIdGUI;
    private IdGUI intoIdGUI;

    public ButtonID(){
        super();
    }

    public IdGUI getCurrentGUIID() {
        return currentIdGUI;
    }

    public void setCurrentGUIID(IdGUI currentGUIID) {
        this.currentIdGUI = currentGUIID;
    }

    public IdGUI getIntoIdGUI() {
        return intoIdGUI;
    }

    public void setIntoIdGUI(IdGUI intoIdGUI) {
        this.intoIdGUI = intoIdGUI;
    }

    @Override
    public String toString() {
        return "ButtonID{" +
                "currentGUIID=" + currentIdGUI +
                ", intoGUIID=" + intoIdGUI +
                '}';
    }
}
