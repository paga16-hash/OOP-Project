package view.factoryGUI.factoryScoreboardGUI.scoreboardGUI;

import utilities.IdGUI;
import model.factoryGUI.scoreboardGUI.NameScoreboardGUI;
import view.factoryGUI.AbstractGUI;
import view.factoryGUI.factoryScoreboardGUI.interfaceScoreboard.ScoreboardGUI;
import view.utilities.ButtonID;

import javax.swing.*;
import java.awt.*;


public class ConcreteScoreboardGUI extends AbstractGUI implements ScoreboardGUI {
    private JLabel lbTitle;
    private JTextField txtSearchName;
    private JButton btnSearch;
    private List scoreboard;
    private ButtonID btnBack;

    public ConcreteScoreboardGUI(){
        super();
        this.lbTitle = new JLabel();
        this.txtSearchName = new JTextField();
        this.btnSearch = new JButton();
        this.scoreboard = new List();
        this.btnBack = new ButtonID();
    }

    @Override
    public java.util.List<? extends JButton> getButtons() {
        return java.util.List.of(this.btnSearch, this.btnBack);
    }
    @Override
    public java.util.List<ButtonID> getLinksButtons() {
        return java.util.List.of(this.btnBack);
    }

    @Override
    public void setNameButtons(java.util.List<NameScoreboardGUI> listName) {
        for(int i = 0; i < listName.size(); i++){
            this.getButton(i).setText(listName.get(i).getName());
        }
    }
    @Override
    public void setBtnBackID(IdGUI intoID) {
        this.btnBack.setCurrentGUIID(this.getId());
        this.btnBack.setCommandIdGUI(intoID);
    }
    @Override
    public void setTitleGUI(final String title){
        this.lbTitle.setText(title);
    }

    @Override
    public void setAllFontNotLbTitle(final Font font){
        this.txtSearchName.setFont(font);
        this.btnSearch.setFont(font);
        this.scoreboard.setFont(font);
        this.btnBack.setFont(font);
    }

    @Override
    public void setAllForeground(Color color) {
        this.lbTitle.setForeground(color);
        this.btnSearch.setForeground(color);
        this.scoreboard.setForeground(color);
        this.btnBack.setForeground(color);
    }

    @Override
    public void setFontLbTitle(final Font font){
        this.lbTitle.setFont(font);
    }

    public JButton getButton(int ind) {
        return getButtons().get(ind);
    }
    public JLabel getLbTitle() {
        return lbTitle;
    }
    public JTextField getTxtSearchName() {
        return txtSearchName;
    }
    public JButton getBtnSearch() {
        return btnSearch;
    }
    public List getScoreboard() {
        return scoreboard;
    }
    public JButton getBtnBack() {
        return btnBack;
    }



}
