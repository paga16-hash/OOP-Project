package view.utilities;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.List;

public class PanelDifficult extends JPanel{
    public static final String TITLE_DIFFICULT = "Difficult";

    private JLabel lbTitle = new JLabel(TITLE_DIFFICULT);
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton rbtEasy = new JRadioButton("Easy");
    private JRadioButton rbtMedium = new JRadioButton("Medium");
    private JRadioButton rbtHard = new JRadioButton("Hard");

    public PanelDifficult(){
        super(new BorderLayout());
        this.setOpaque(false);
        this.add(FactoryGUIs.encapsulatesInPanel_Flow(this.lbTitle), BorderLayout.NORTH);
        this.add(FactoryGUIs.getUnionComponents(List.of(this.rbtEasy,this.rbtMedium,this.rbtHard)), BorderLayout.CENTER);
        this.createGroup();



//        URL imgURL = ClassLoader.getSystemResource("easy.png");
//        ImageIcon img = new ImageIcon(imgURL);
//        Image mage = img.getImage();
//        Image newMage = mage.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
//        img.setImage(newMage);
//
//        this.rbtEasy.setIcon(img);

    }


    private void createGroup(){
        this.rbtEasy.setOpaque(false);
        this.rbtMedium.setOpaque(false);
        this.rbtHard.setOpaque(false);
        this.group.add(this.rbtEasy);
        this.group.add(this.rbtMedium);
        this.group.add(this.rbtHard);
    }

    public void setFontTitleDifficult(final Font font){
        this.lbTitle.setFont(font);
    }

    public void setFontGroupRadioButton(final Font font){
        this.rbtEasy.setFont(font);
        this.rbtMedium.setFont(font);
        this.rbtHard.setFont(font);
    }
}
