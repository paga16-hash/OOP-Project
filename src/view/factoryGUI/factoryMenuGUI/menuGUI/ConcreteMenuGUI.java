package view.factoryGUI.factoryMenuGUI.menuGUI;

import utilities.IdGUI;
import utilities.NameMenuGUI;
import view.factoryGUI.AbstractGUI;
import view.factoryGUI.factoryMenuGUI.intefaceMenu.MenuGUI;
import view.utilities.ButtonID;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class ConcreteMenuGUI extends AbstractGUI implements MenuGUI {
    private final JLabel lbTitle;
    private final JTextField txtName;
    private final List<ButtonID> buttons;

    public ConcreteMenuGUI(){
        super();
        this.lbTitle = new JLabel();
        this.txtName = new JTextField();
        this.buttons = new ArrayList<>();
    }

    @Override
    public List<? extends JButton> getButtons(){
        return this.buttons;
    }
    @Override
    public List<ButtonID> getLinksButtons() {
        return this.buttons;
    }

    @Override
    public void setTitleGUI(final String title){
        this.lbTitle.setText(title);
    }
    @Override
    public void setNameButtons(List<NameMenuGUI> listName) {
        for(int i = 0; i < listName.size(); i++){
            this.buttons.get(i).setText(listName.get(i).getName());
        }
    }
    @Override
    public void setIDButtons(List<IdGUI> linksID) {
        for(int i = 0; i < linksID.size(); i++){
            this.buttons.get(i).setCurrentGUIID(this.getId());
            this.buttons.get(i).setCommandIdGUI(linksID.get(i));
        }
    }

    @Override
    public void setFontAll(final Font font){
        this.txtName.setFont(font);
        for (JComponent btn : this.buttons) {
            btn.setFont(font);
        }
    }
    @Override
    public void setFontTitle(final Font font){
        this.lbTitle.setFont(font);
    }

    public JLabel getLbTitle(){
        return this.lbTitle;
    }
    public JTextField getTxtName(){
        return this.txtName;
    }
    public void addButton(final int nBtn) {
        for (int i = 0; i < nBtn; i++) {
            this.buttons.add(new ButtonID());
        }
    }
    public ButtonID getButton(final int id){
        return this.buttons.get(id);
    }




}
