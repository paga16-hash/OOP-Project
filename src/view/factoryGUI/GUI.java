package view.factoryGUI;

import utilities.IdGUI;
import view.utilities.ButtonID;

import javax.swing.*;
import java.util.List;

public interface GUI {
    public void validate();

    public void setVisible(boolean visible);

    public void setId(final IdGUI id);

    public IdGUI getId();


    public List<? extends JButton> getButtons();

    public List<ButtonID> getLinksButtons();
}
