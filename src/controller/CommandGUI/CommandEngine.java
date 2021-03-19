package controller.CommandGUI;

import model.factory.GUIEngine;

public interface CommandEngine {
    public CommandGUI execute(final GUIEngine engineGUI);
}
