package model.factory;

import utilities.IdGUI;

import java.util.List;

public interface GUIEngine {

    public boolean getState();

    public void setState(final boolean state);

    public void changeState();

    public IdGUI getId();

    public IdGUI getLink();

    public List<IdGUI> getLinks();

    public String getTitleGUI();

}
