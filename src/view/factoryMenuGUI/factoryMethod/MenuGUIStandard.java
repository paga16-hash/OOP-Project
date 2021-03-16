package view.factoryMenuGUI.factoryMethod;

import view.factoryMenuGUI.intefaceFactoryMenu.FactoryMenuGUI;
import view.factoryMenuGUI.intefaceFactoryMenu.GraphicsMenu;
import view.factoryMenuGUI.intefaceFactoryMenu.MenuGUI;
import view.factoryMenuGUI.menuGUI.ConcreteMenuGUI;

import java.awt.*;

import java.util.List;

public class MenuGUIStandard implements FactoryMenuGUI, GraphicsMenu {
    private final ConcreteMenuGUI concreteMenuGUI = new ConcreteMenuGUI();

    @Override
    public MenuGUI createGUI() {
        this.concreteMenuGUI.addButton(N_BUTTONS);
        this.concreteMenuGUI.setBackgroundGUI(Color.CYAN);
        this.concreteMenuGUI.getTxtName().setColumns(SIZE_COLUMNS_TEXT);
        this.concreteMenuGUI.setFontAll(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT));
        this.concreteMenuGUI.setFontTitle(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT_TITLE));
        this.createGraphics();
        this.concreteMenuGUI.validate();
        return concreteMenuGUI;
    }

    private void createGraphics() {
        int nBtnUsed = N_BUTTONS;
        this.concreteMenuGUI.setLayoutGUI(new GridBagLayout());
        GridBagConstraints lim = this.getGBConstraints();

        this.concreteMenuGUI.add(this.concreteMenuGUI.getLbTitle(), lim);
        this.resetGridBagContraints(lim);
        lim.gridy++;
        this.concreteMenuGUI.add(getUnionComponent(List.of(concreteMenuGUI.getTxtName(),
                concreteMenuGUI.getButtons().get(IND_BUTTON_START))), lim);
        nBtnUsed--;

        for (int i = (N_BUTTONS - nBtnUsed); i < nBtnUsed; i++) {
            lim.gridy++;
            this.concreteMenuGUI.add(this.concreteMenuGUI.getButton(i), lim);
        }
    }

}
