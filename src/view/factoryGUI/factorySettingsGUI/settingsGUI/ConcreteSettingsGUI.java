package view.factoryGUI.factorySettingsGUI.settingsGUI;

import utilities.IdGUI;
import utilities.NameScoreboardGUI;
import view.factoryGUI.AbstractGUI;
import view.factoryGUI.factorySettingsGUI.intefaceSettings.SettingsGUI;
import view.utilities.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class ConcreteSettingsGUI extends AbstractGUI implements SettingsGUI {
    private JLabel lbTitle;
    private PanelSkin panelSkin;
    private PanelDifficult panelDifficult;
    private PanelSound panelSound;
    private ButtonID btnBack;

    public ConcreteSettingsGUI() {
        super();
        this.lbTitle = new JLabel();
        try {
            // manca la gestione dell'Exception
            this.panelSkin = new PanelSkin();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.panelDifficult = new PanelDifficult();
        this.panelSound = new PanelSound();
        this.btnBack = new ButtonID();
        this.setVisible(true);

    }

    @Override
    public void setFontAll(Font font) {
        this.panelSound.setFontSliderSound(font);
        this.panelDifficult.setFontGroupRadioButton(font);
        this.panelSkin.setFontButtons(font);
    }

    @Override
    public void setFontTitle(Font font) {
        this.lbTitle.setFont(font);
    }

    @Override
    public List<? extends JButton> getButtons() {
        return null;
    }

    @Override
    public List<ButtonID> getLinksButtons() {
        return null;
    }

    @Override
    public void setTitleGUI(String title) {
        this.lbTitle.setText(title);
    }

    @Override
    public void setFontTitlePanel(Font font) {
        this.panelDifficult.setFontTitleDifficult(font);
        this.panelSound.setFontTitleSound(font);
        this.btnBack.setFont(font);
    }

    @Override
    public void setBtnBackID(IdGUI intoID) {
        this.btnBack.setCurrentGUIID(this.getId());
        this.btnBack.setCommandIdGUI(intoID);
    }

    @Override
    public void setNameButtons(List<NameScoreboardGUI> listName) {
        this.btnBack.setText("Back");
    }

    public JLabel getLbTitle(){
        return this.lbTitle;
    }

    public JButton getBtnBack(){
        return this.btnBack;
    }

    public PanelSkin getPanelSkin() {
        return this.panelSkin;
    }

    public PanelDifficult getPanelDifficult(){
        return this.panelDifficult;
    }

    public PanelSound getPanelSound() {
        return this.panelSound;
    }
}
