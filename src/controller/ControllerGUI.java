package controller;

import controller.CommandGUI.CommandEngine;
import controller.CommandGUI.OFFCommandEngine;
import controller.CommandGUI.ONCommandEngine;
import model.factory.GUIEngine;
import utilities.IdGUI;
import view.factoryGUI.GUI;
import view.utilities.ButtonID;

import java.util.ArrayList;
import java.util.List;

public class ControllerGUI {
    private List<IdGUI> crologia = new ArrayList<>();
    private List<GUIEngine> listEngine;
    private List<GUI> listGUI;
    private CommandEngine onCommandEngine = new ONCommandEngine();
    private CommandEngine offCommandEngine = new OFFCommandEngine();

    public ControllerGUI(final List<GUI> listGUI, List<GUIEngine> listEngine){
        this.listEngine = listEngine;
        this.listGUI = listGUI;
        this.crologia.add(IdGUI.ID_MENU);
        this.linksAll();
    }

    private void linksAll(){

        for (GUI gui : this.listGUI) {
            for (ButtonID btn : gui.getLinksButtons()) {
                btn.addActionListener(e -> {
                    System.out.println("Premuto in: " + btn.getCurrentGUIID() + " Vado in: " + btn.getCommandIdGUI());

                    if(btn.getCommandIdGUI() != IdGUI.ID_BACK){
                        this.crologia.add(btn.getCommandIdGUI());

                        this.onCommandEngine.execute(this.getEngine(this.lastCrono())).execute(this.getGUI(this.lastCrono()));
                        this.offCommandEngine.execute(this.getEngine(this.penultimateCrono())).execute(this.getGUI(this.penultimateCrono()));

                    } else{
                        this.offCommandEngine.execute(this.getEngine(this.lastCrono())).execute(this.getGUI(this.lastCrono()));
                        this.onCommandEngine.execute(this.getEngine(this.penultimateCrono())).execute(this.getGUI(this.penultimateCrono()));

                        this.crologia.remove(this.lastCrono());
                    }
                    System.out.println("list" + this.crologia);
                });
            }
        }
    }


    private IdGUI lastCrono(){
        return this.crologia.get(this.crologia.size() - 1);
    }

    private IdGUI penultimateCrono(){
        return this.crologia.get(this.crologia.size() - 2);
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
