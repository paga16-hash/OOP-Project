package view.utilities;

import utilities.SkinSpaceShip;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PanelSkin extends JPanel {
    private JButton btSX;
    private JButton btDX;

    private SkinSpaceShip skinSpaceShip = SkinSpaceShip.DELUXE;
    private PanelImage pnImage;

    public PanelSkin() throws IOException {
        super(new BorderLayout());
        this.setOpaque(false);
        this.btDX = new JButton(">");
        this.btSX = new JButton("<");
        this.pnImage = new PanelImage(this.skinSpaceShip.getPath());
        this.createGraphics();
    }

    private void createGraphics(){
        this.add(FactoryGUIs.encapsulatesInPanel_Box_Vertical_Center(this.btSX), BorderLayout.WEST);
        this.add(this.pnImage, BorderLayout.CENTER);
        this.add(FactoryGUIs.encapsulatesInPanel_Box_Vertical_Center(this.btDX), BorderLayout.EAST);
    }

    public void setFontButtons(final Font font){
        this.btSX.setFont(font);
        this.btDX.setFont(font);
    }
}
