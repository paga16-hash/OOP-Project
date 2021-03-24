package model.factoryGUI.helpGUI;

import model.MyJImage.MyJImageEngine;
import model.factoryGUI.GUIEngine;
import utilities.IdGUI;

import java.util.*;
import java.util.stream.Collectors;

public class HelpEngine implements GUIEngine {
    private final String TITLE_GUI = "HELP";
    private final IdGUI Id = IdGUI.ID_HELP;

    private final List<HelpPanelsName> listHelpPanelsName = new ArrayList<>();
    private final List<HelpButtonsName> listButtonsName = new ArrayList<>();
    private final Map<String, List<MyJImageEngine>> listHelpImage = new HashMap<>();

    private final List<IdGUI> linksID = new ArrayList<>();

    private boolean state = false;

    public HelpEngine(){
        this.linksID.add(IdGUI.ID_BACK);
        Collections.addAll(this.listHelpPanelsName, HelpPanelsName.values());
        Collections.addAll(this.listButtonsName, HelpButtonsName.values());

        this.listHelpPanelsName.forEach(e -> this.listHelpImage.put(e.getName(), e.getPathFiles()));
    }

    @Override
    public IdGUI getId() {
        return this.Id;
    }

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void changeState() {
        this.state = !state;
    }

    @Override
    public String getTitleGUI() {
        return TITLE_GUI;
    }

    @Override
    public IdGUI getLink() {
        return this.linksID.get(0);
    }

    @Override
    public List<IdGUI> getLinks() {
        return this.linksID;
    }


    public List<String> getListHelpPanelsName() {
        return this.listHelpPanelsName.stream().map(p -> p.getName()).collect(Collectors.toList());
    }

    public List<String> getListButtonsName() {
        return this.listButtonsName.stream().map(p -> p.getName()).collect(Collectors.toList());
    }

    public List<MyJImageEngine> getPathImagePanel(final String panelName){
        return this.listHelpImage.get(panelName);
    }




}
