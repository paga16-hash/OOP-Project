package view.utilities;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FactoryGUIs {

    public static JPanel encapsulatesInPanel_Flow(Component component){
        JPanel encapsulate = new JPanel(new FlowLayout());
        encapsulate.setOpaque(false);
        encapsulate.add(component);
        return encapsulate;
    }

    public static JPanel encapsulatesInPanel_Box_Vertical_Center(Component component){
        JPanel encapsulate = new JPanel();
        encapsulate.setOpaque(false);
        encapsulate.setLayout(new BoxLayout(encapsulate, BoxLayout.X_AXIS));
        encapsulate.add(component);
        return encapsulate;
    }

    public static JPanel getUnionComponents(List<JComponent> list){
        JPanel unionComponent = new JPanel(new FlowLayout());
        unionComponent.setOpaque(false);
        for (JComponent component : list) {
            unionComponent.add(component);
        }
        return unionComponent;
    }

    public static void resetGridBagContraints(GridBagConstraints lim){
        lim.ipadx = 0;
        lim.ipady = 0;
        lim.gridx = 0;
        lim.gridy = 0;
    }

    public static GridBagConstraints getGBConstraints(){
        GridBagConstraints lim = new GridBagConstraints();
        lim.fill = GridBagConstraints.HORIZONTAL;
        lim.insets = new Insets(3,3,3,3);
        lim.gridx = 0;
        lim.gridy = 0;
        lim.ipady = 80;
        return lim;
    }
}
