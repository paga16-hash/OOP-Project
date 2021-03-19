package game;

import controller.ControllerGUI;
import controller.ControllerMenu;
import controller.ControllerScoreboard;
import model.factory.MenuEngine;
import model.factory.ScoreboardEngine;
import view.factoryGUI.FactoryGUI;
import view.factoryGUI.factoryMenuGUI.intefaceMenu.MenuGUI;
import view.factoryGUI.factoryScoreboardGUI.interfaceScoreboard.ScoreboardGUI;
import view.factoryGUI.factorySettingsGUI.intefaceSettings.FactorySettingsGUI;
import view.factoryGUI.factorySettingsGUI.intefaceSettings.SettingsGUI;

import java.io.IOException;
import java.util.List;

public class SpaceMala {

    private MenuGUI menuGUI = FactoryGUI.createMenuGUI();
    private MenuEngine menuEngine = new MenuEngine();
    private ControllerMenu controllerMenu = new ControllerMenu(menuGUI, menuEngine);

    private ScoreboardGUI scoreboardGUI = FactoryGUI.createScoreboardGUI();
    private ScoreboardEngine scoreboardEngine = new ScoreboardEngine();
    private ControllerScoreboard controllerScoreboard = new ControllerScoreboard(scoreboardGUI, scoreboardEngine);

    private SettingsGUI settingsGUI = FactoryGUI.createSettingsGUI();

    private ControllerGUI controllerGUI = new ControllerGUI(List.of(menuGUI, scoreboardGUI), List.of(menuEngine, scoreboardEngine));

    public SpaceMala() throws IOException {

    }




//    public ControllerMenu getControllerMenu() {
//        return this.controllerMenu;
//    }
//
//    public ControllerScoreboard getControllerScoreboard(){
//        return this.controllerScoreboard;
//    }

}
