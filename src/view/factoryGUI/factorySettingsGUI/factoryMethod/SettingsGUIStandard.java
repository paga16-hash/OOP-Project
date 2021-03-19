package view.factoryGUI.factorySettingsGUI.factoryMethod;

import view.factoryGUI.factorySettingsGUI.intefaceSettings.FactorySettingsGUI;
import view.factoryGUI.factorySettingsGUI.intefaceSettings.SettingsGUI;
import view.factoryGUI.factorySettingsGUI.settingsGUI.ConcreteSettingsGUI;
import view.utilities.FactoryGUIs;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SettingsGUIStandard implements FactorySettingsGUI {
    private ConcreteSettingsGUI concreteSettingsGUI = new ConcreteSettingsGUI();

    @Override
    public SettingsGUI create() {
        this.concreteSettingsGUI.setTitleGUI("SETTINGS");
        this.concreteSettingsGUI.setFontTitle(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT_TITLE));
        this.concreteSettingsGUI.setFontTitlePanel(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT_TITLE_PANEL));
        this.concreteSettingsGUI.setFontAll(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT));
        this.concreteSettingsGUI.setBackgroundGUI(Color.GREEN);
        this.concreteSettingsGUI.setLayoutGUI(new BorderLayout());
        this.createGraphics();
        this.concreteSettingsGUI.validate();
        return concreteSettingsGUI;
    }

    private void createGraphics() {
        GridBagConstraints lim = FactoryGUIs.getGBConstraints();
        this.concreteSettingsGUI.add(FactoryGUIs.encapsulatesInPanel_Flow(
                this.concreteSettingsGUI.getLbTitle()), BorderLayout.NORTH);

        FactoryGUIs.resetGridBagContraints(lim);
        JPanel panelContainPanel = new JPanel(new GridBagLayout());
        panelContainPanel.setOpaque(false);

        panelContainPanel.add(this.concreteSettingsGUI.getPanelSkin(), lim);
        lim.gridy++;
        panelContainPanel.add(this.concreteSettingsGUI.getPanelDifficult(), lim);
        lim.gridy++;
        panelContainPanel.add(this.concreteSettingsGUI.getPanelSound(), lim);

        this.concreteSettingsGUI.add(panelContainPanel, BorderLayout.CENTER);
        this.concreteSettingsGUI.setNameButtons(List.of());
        this.concreteSettingsGUI.add(this.concreteSettingsGUI.getBtnBack(), BorderLayout.SOUTH);

    }
}
