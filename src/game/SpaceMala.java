package game;

import controller.ControllerGUI;
import controller.ControllerMenu;
import controller.ControllerScoreboard;
import model.factory.MenuEngine;
import model.factory.ScoreboardEngine;
import view.factoryMenuGUI.factoryMethod.MenuGUICompact;
import view.factoryMenuGUI.factoryMethod.MenuGUIStandard;
import view.factoryMenuGUI.intefaceFactoryMenu.FactoryMenuGUI;
import view.factoryMenuGUI.intefaceFactoryMenu.MenuGUI;
import view.factoryScoreboardGUI.factoryMethod.ScoreboardGUIReverse;
import view.factoryScoreboardGUI.factoryMethod.ScoreboardGUIStandard;
import view.factoryScoreboardGUI.interfaceFactoryScoreboard.FactoryScoreboardGUI;
import view.factoryScoreboardGUI.interfaceFactoryScoreboard.ScoreboardGUI;

import java.util.List;

public class SpaceMala {
    private FactoryMenuGUI factoryMenuGUI = new MenuGUIStandard();
    private MenuGUI menuGUI = factoryMenuGUI.createGUI();
    private MenuEngine menuEngine = new MenuEngine();
    private ControllerMenu controllerMenu = new ControllerMenu(menuGUI, menuEngine);

    private FactoryScoreboardGUI factoryScoreboardGUI = new ScoreboardGUIStandard();
    private ScoreboardGUI scoreboardGUI = factoryScoreboardGUI.createGUI();
    private ScoreboardEngine scoreboardEngine = new ScoreboardEngine();
    private ControllerScoreboard controllerScoreboard = new ControllerScoreboard(scoreboardGUI, scoreboardEngine);

    private ControllerGUI controllerGUI = new ControllerGUI(List.of(menuGUI, scoreboardGUI), List.of(menuEngine, scoreboardEngine));
    public SpaceMala(){
        this.id();
    }

    public void id(){
        System.out.println(menuGUI.getId() + " arrivo "+ scoreboardGUI.getId());
    }


//    public ControllerMenu getControllerMenu() {
//        return this.controllerMenu;
//    }
//
//    public ControllerScoreboard getControllerScoreboard(){
//        return this.controllerScoreboard;
//    }

}
