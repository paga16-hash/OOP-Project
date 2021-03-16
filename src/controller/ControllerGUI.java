package controller;

import model.factory.GUIEngine;
import utilities.IdGUI;
import view.factoryGUI.GUI;
import view.utilities.ButtonID;

import java.util.ArrayList;
import java.util.List;

public class ControllerGUI {
    List<GUIEngine> listEngine = new ArrayList<>();
    List<GUI> listGUI = new ArrayList<>();

    public ControllerGUI(final List<GUI> listGUI, List<GUIEngine> listEngine){
        this.listEngine = listEngine;
        this.listGUI = listGUI;
        this.linksAll();
    }

    private void linksAll(){
        for (GUI gui : this.listGUI) {
            for (ButtonID btn : gui.getLinksButtons()) {
                btn.addActionListener(e -> {
                    this.getEngine(btn.getCurrentGUIID()).changeState();
                    this.getEngine(btn.getIntoIdGUI()).changeState();
                    gui.setVisible(this.getEngine(btn.getCurrentGUIID()).getState());
                    this.getGUI(btn.getIntoIdGUI()).setVisible(this.getEngine(btn.getIntoIdGUI()).getState());
                });
            }
        }
    }

    private GUIEngine getEngine(IdGUI id){
        for (GUIEngine enigne : this.listEngine) {
            if(enigne.getId() == id){
                return enigne;
            }
        }
        return null;
    }

    private GUI getGUI(IdGUI id){
        for (GUI gui : this.listGUI) {
            if(gui.getId() == id){
                return gui;
            }
        }
        return null;
    }
}
