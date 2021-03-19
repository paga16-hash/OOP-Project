package view.factoryGUI;

import utilities.IdGUI;

import javax.swing.*;
import java.awt.*;


public abstract class AbstractGUI extends JFrame{
    protected JPanel panel;
    protected IdGUI id;

    public AbstractGUI() {
        super("Space Survival");
        this.panel = new JPanel();
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
    }

    public void setLayoutGUI(final LayoutManager layout){
        this.panel.setLayout(layout);
    }

    public void setBackgroundGUI(final Color color) {
        this.panel.setBackground(color);
    }

    public IdGUI getId(){
        return this.id;
    }

    public void setId(final IdGUI id){
        this.id = id;
    }

    public abstract void setFontAll(final Font font);

    public abstract void setFontTitle(final Font font);

    public JPanel getPanel(){
        return this.panel;
    }

}
