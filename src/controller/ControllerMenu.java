package controller;

import model.factory.MenuEngine;
import view.factoryMenuGUI.intefaceFactoryMenu.MenuGUI;
import view.utilities.ButtonID;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerMenu {
    private MenuGUI menuGUI;
    private MenuEngine menuEngine;

    public ControllerMenu(final MenuGUI menuGUI, final MenuEngine menuEngine){
        this.menuGUI = menuGUI;
        this.menuEngine = menuEngine;
        this.initMenu();
        this.assignmentLinksID();
    }

    private void initMenu(){
        this.menuGUI.setId(this.menuEngine.getId());
        this.menuGUI.setTitleGUI(this.menuEngine.getTitleGUI());
        this.menuGUI.setNameButtons(this.menuEngine.getListName());
        this.menuGUI.setIDButtons(this.menuEngine.getLinks());
        this.menuGUI.setVisible(this.menuEngine.getState());

    }

    public void assignmentLinksID(){
        for (JButton btn : this.menuGUI.getButtons()) {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    final ButtonID bt = (ButtonID) e.getSource();
                    System.out.println(bt.toString());

                }
            });
        }
    }
}
