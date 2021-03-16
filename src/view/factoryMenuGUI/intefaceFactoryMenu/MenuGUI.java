package view.factoryMenuGUI.intefaceFactoryMenu;

import utilities.IdGUI;
import utilities.NameMenuGUI;
import view.factoryGUI.GUI;
import view.utilities.ButtonID;

import javax.swing.*;
import java.util.List;

public interface MenuGUI extends GUI{

    public void setTitleGUI(final String title);

    public void setNameButtons(final List<NameMenuGUI> listNames);

    public void setIDButtons(final List<IdGUI> linksID);

    public void setBounds(int x, int y, int width, int height);

}
