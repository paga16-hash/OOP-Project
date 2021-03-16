package model.factory;

import utilities.IdGUI;
import utilities.NameScoreboardGUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreboardEngine implements GUIEngine{
    private final String TITLE_SCOREBOARD = "SCOREBOARD";
    private final List<NameScoreboardGUI> nameButtons = new ArrayList<>();

    private final IdGUI ID = IdGUI.ID_SCOREBOARD;
    private final IdGUI back = IdGUI.ID_MENU;

    private boolean state = false;

    public ScoreboardEngine() {
        Collections.addAll(this.nameButtons, NameScoreboardGUI.values());
    }

    @Override
    public String getTitleGUI(){
        return this.TITLE_SCOREBOARD;
    }
    @Override
    public boolean getState(){
        return this.state;
    }
    @Override
    public void changeState(){
        this.state = !state;
    }
    @Override
    public IdGUI getId() {
        return ID;
    }
    @Override
    public IdGUI getLink() {
        return this.back;
    }
    @Override
    public List<IdGUI> getLinks() {
        return List.of(this.back);
    }

    public List<NameScoreboardGUI> getListName(){
        return this.nameButtons;
    }


}
