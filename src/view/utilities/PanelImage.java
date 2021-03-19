package view.utilities;

import javax.swing.*;
import java.awt.*;

import java.net.URL;

public class PanelImage extends JPanel{
    private URL imgURL;
    private ImageIcon icon;
    private JLabel lbImage;

    public PanelImage(final String pathFile) {
        super(new FlowLayout());
        this.setOpaque(false);
        this.imgURL = ClassLoader.getSystemResource(pathFile);
        this.icon = new ImageIcon(this.imgURL);
        this.lbImage = new JLabel(icon);
        this.add(this.lbImage);
    }

}
