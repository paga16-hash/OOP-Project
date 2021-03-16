package view.factoryScoreboardGUI.factoryMethod;

import view.factoryScoreboardGUI.interfaceFactoryScoreboard.FactoryScoreboardGUI;
import view.factoryScoreboardGUI.interfaceFactoryScoreboard.GraphicsScoreboard;
import view.factoryScoreboardGUI.interfaceFactoryScoreboard.ScoreboardGUI;
import view.factoryScoreboardGUI.scoreboardGUI.ConcreteScoreboardGUI;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ScoreboardGUIReverse implements FactoryScoreboardGUI, GraphicsScoreboard {
    private final ConcreteScoreboardGUI concreteScoreboardGUI = new ConcreteScoreboardGUI();

    @Override
    public ScoreboardGUI createGUI() {
        this.concreteScoreboardGUI.setBackgroundGUI(Color.PINK);
        this.concreteScoreboardGUI.getTxtSearchName().setColumns(SIZE_COLUMNS_TEXT);
        this.concreteScoreboardGUI.setFontTitle(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT_TITLE));
        this.concreteScoreboardGUI.setFontAll(new Font(TYPE_FONT, Font.BOLD, SIZE_FONT));

        this.createGraphics();
        return this.concreteScoreboardGUI;
    }

    private void createGraphics() {
        this.concreteScoreboardGUI.setLayoutGUI(new BorderLayout());

        this.concreteScoreboardGUI.add(this.encapsulatesInPanel(
                this.concreteScoreboardGUI.getLbTitle()), BorderLayout.NORTH);


        JPanel panelScore = new JPanel(new BorderLayout());
        panelScore.setOpaque(false);

        panelScore.add(this.getUnionComponent(java.util.List.of(this.concreteScoreboardGUI.getTxtSearchName(),
                this.concreteScoreboardGUI.getBtnSearch())), BorderLayout.SOUTH);

        panelScore.add(this.encapsulatesInPanel(
                this.concreteScoreboardGUI.getScoreboard()), BorderLayout.CENTER);

        this.concreteScoreboardGUI.add(panelScore, BorderLayout.CENTER);
        this.concreteScoreboardGUI.add(this.concreteScoreboardGUI.getBtnBack(), BorderLayout.SOUTH);

    }

    private JPanel encapsulatesInPanel(Component component){
        JPanel encapsulate = new JPanel(new FlowLayout());
        encapsulate.setOpaque(false);
        encapsulate.add(component);
        return encapsulate;
    }

    private JPanel getUnionComponent(List<JComponent> list){
        JPanel unionComponent = new JPanel(new FlowLayout());
        unionComponent.setOpaque(false);
        for (JComponent component : list) {
            unionComponent.add(component);
        }
        return unionComponent;
    }
}
