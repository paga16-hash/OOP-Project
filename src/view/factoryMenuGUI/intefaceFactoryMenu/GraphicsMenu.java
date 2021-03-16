package view.factoryMenuGUI.intefaceFactoryMenu;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public interface GraphicsMenu {
    public static final String TYPE_FONT = "Helvetica";
    public static final int SIZE_COLUMNS_TEXT = 10;
    public static final int SIZE_FONT_TITLE = 30;
    public static final int IND_BUTTON_START = 0;
    public static final int SIZE_FONT = 20;
    public static final int N_BUTTONS = 6;
    default GridBagConstraints getGBConstraints(){
        GridBagConstraints lim = new GridBagConstraints();
        lim.fill = GridBagConstraints.HORIZONTAL;
        lim.insets = new Insets(3,3,3,3);
        lim.gridx = 0;
        lim.gridy = 0;
        lim.ipady = 80;
        return lim;
    }

    default void resetGridBagContraints(GridBagConstraints lim){
        lim.ipadx = 0;
        lim.ipady = 0;
        lim.gridx = 0;
        lim.gridy = 0;
    }

    default JPanel getUnionComponent(List<JComponent> list){
        JPanel unionComponent = new JPanel(new FlowLayout());
        for (JComponent component : list) {
            unionComponent.add(component);
        }
        return unionComponent;
    }
}
