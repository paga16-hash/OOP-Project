package model.factory;

import utilities.IdGUI;
import utilities.NameSettigsGUI;

import java.util.ArrayList;
import java.util.List;

public class SettingsEngine implements GUIEngine{
    private final String TITLE_SETTINGS = "SETTINGS";
    private final List<NameSettigsGUI> namesButtons = new ArrayList<>();

    private final IdGUI ID = IdGUI.ID_SETTING;
    private final List<IdGUI> linksID = new ArrayList<>();

    private boolean state = false;

    @Override
    public boolean getState() {
        return false;
    }

    @Override
    public void setState(boolean state) {

    }

    @Override
    public void changeState() {

    }

    @Override
    public IdGUI getId() {
        return null;
    }

    @Override
    public IdGUI getLink() {
        return null;
    }

    @Override
    public List<IdGUI> getLinks() {
        return null;
    }

    @Override
    public String getTitleGUI() {
        return null;
    }
}
