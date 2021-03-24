package utilities;

import model.MyJImage.MyJImageEngine;

import java.awt.*;
import java.net.URL;

public class DesignSpace {
    public static final int GUI_WIDTH = 800;
    public static final int GUI_HEIGHT = 650;

    public static int SIZE_FONT_MAX = 60;
    public static int SIZE_FONT_BIG = 30;
    public static int SIZE_FONT_MEDIUM = 25;
    public static int SIZE_FONT_SMALL = 15;

    public static final int SIZE_IMAGE_MEDIUM = 70;
    public static final int SIZE_IMAGE_SMALL = 50;

    public static final String TYPE_FONT_STANDARD = "Helvetica";

    public static final Font FONT_BIG_STANDARD = new Font(TYPE_FONT_STANDARD, Font.BOLD, SIZE_FONT_BIG);
    public static final Font FONT_MEDIUM_STANDARD = new Font(TYPE_FONT_STANDARD, Font.BOLD, SIZE_FONT_MEDIUM);
    public static final Font FONT_SMALL_STANDARD = new Font(TYPE_FONT_STANDARD, Font.BOLD, SIZE_FONT_SMALL);

    public static final int SIZE_COLUMNS_TEXT = 10;

    public static Color color1 = new Color(90, 165, 232);
    public static Color color2 = new Color(128, 213, 255);
    public static Color color3 = new Color(148, 233, 255);

    public static Font getFontForTitle(final int size){
        URL fontUrl = ClassLoader.getSystemResource("font/prova2.ttf");
        Font myFont = null;
        try {
            myFont = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
        } catch (Exception e) {
            System.err.println("Path del file font non trovato");
        }
        myFont = myFont.deriveFont(Font.PLAIN,size);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(myFont);

        return myFont;
    }

    public static MyJImageEngine modificationSizeMediumImage(final MyJImageEngine image){
        image.setDimensionImage(new Dimension(SIZE_IMAGE_MEDIUM, SIZE_IMAGE_MEDIUM));
        return image;
    }

}
