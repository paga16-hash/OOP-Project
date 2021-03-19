package view.factoryGUI.factoryMenuGUI.factoryMethod;

import view.factoryGUI.factoryMenuGUI.intefaceMenu.FactoryMenuGUI;
import view.factoryGUI.factoryMenuGUI.intefaceMenu.MenuGUI;
import view.factoryGUI.factoryMenuGUI.menuGUI.ConcreteMenuGUI;
import view.utilities.FactoryGUIs;

import java.awt.*;
import java.util.List;

public class MenuGUICompact implements FactoryMenuGUI {
    private final ConcreteMenuGUI concreteMenuGUI = new ConcreteMenuGUI();

    @Override
    public MenuGUI createGUI() {
        this.concreteMenuGUI.addButton(N_BUTTONS);
        this.concreteMenuGUI.setBackgroundGUI(Color.orange);
        this.concreteMenuGUI.getTxtName().setColumns(SIZE_COLUMNS_TEXT);
        this.concreteMenuGUI.setFontAll(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT));
        this.concreteMenuGUI.setFontTitle(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT_TITLE));
        this.createGraphics();
        this.concreteMenuGUI.validate();

        System.out.println(this.concreteMenuGUI.getName());

        return this.concreteMenuGUI;
    }

    private void createGraphics() {
        int nBtnUsed = N_BUTTONS;
        this.concreteMenuGUI.setLayoutGUI(new GridBagLayout());
        GridBagConstraints lim = FactoryGUIs.getGBConstraints();

        this.concreteMenuGUI.add(this.concreteMenuGUI.getLbTitle(), lim);
        FactoryGUIs.resetGridBagContraints(lim);
        lim.gridy++;
        this.concreteMenuGUI.add(FactoryGUIs.getUnionComponents(List.of(this.concreteMenuGUI.getTxtName(),
                this.concreteMenuGUI.getButtons().get(IND_BUTTON_START))), lim);
        nBtnUsed--;

        for (int i = (N_BUTTONS - nBtnUsed); i < nBtnUsed; i++) {
            lim.gridy++;
            this.concreteMenuGUI.add(FactoryGUIs.getUnionComponents(List.of(this.concreteMenuGUI.getButtons().get(i++),
                    this.concreteMenuGUI.getButtons().get(i))), lim);
            nBtnUsed--;
        }

    }




}
