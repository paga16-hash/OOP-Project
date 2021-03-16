package view.factoryScoreboardGUI.interfaceFactoryScoreboard;

import utilities.IdGUI;
import utilities.NameScoreboardGUI;
import view.factoryGUI.GUI;

import javax.swing.*;
import java.util.List;

public interface ScoreboardGUI extends GUI {
    public void setBounds(int x, int y, int width, int height);

    public void setNameButtons(List<NameScoreboardGUI> listName);

    public void setBtnBackID(final IdGUI intoID);

    public void setTitleGUI(final String title);
}
