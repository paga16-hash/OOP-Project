package controller;

import model.factory.ScoreboardEngine;
import view.factoryScoreboardGUI.interfaceFactoryScoreboard.ScoreboardGUI;
import view.utilities.ButtonID;

import javax.swing.*;

public class ControllerScoreboard {
    private ScoreboardGUI scoreboardGUI;
    private ScoreboardEngine scoreboardEngine;

    public ControllerScoreboard(final ScoreboardGUI scoreboardGUI, final ScoreboardEngine scoreboardEngine){
        this.scoreboardGUI = scoreboardGUI;
        this.scoreboardEngine = scoreboardEngine;
        this.initScoreboard();
        this.assignmentLinksID();
    }

    private void initScoreboard(){
        this.scoreboardGUI.setId(this.scoreboardEngine.getId());
        this.scoreboardGUI.setTitleGUI(this.scoreboardEngine.getTitleGUI());
        this.scoreboardGUI.setNameButtons(this.scoreboardEngine.getListName());
        this.scoreboardGUI.setBtnBackID(this.scoreboardEngine.getLink());
        this.scoreboardGUI.setVisible(this.scoreboardEngine.getState());
    }

    private void assignmentLinksID(){
        for (JButton btn : this.scoreboardGUI.getLinksButtons()) {
            btn.addActionListener(e -> {
                final ButtonID bt = (ButtonID) e.getSource();
                System.out.println(bt.toString());
            });
        }
    }

}
