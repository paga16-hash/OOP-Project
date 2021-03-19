package view.factoryGUI.factoryScoreboardGUI.interfaceScoreboard;

public interface FactoryScoreboardGUI {
    public static final String TYPE_FONT = "Helvetica";
    public static final int SIZE_COLUMNS_TEXT = 10;
    public static final int SIZE_FONT_TITLE = 30;
    public static final int SIZE_FONT = 20;

    public ScoreboardGUI createGUI();
}
