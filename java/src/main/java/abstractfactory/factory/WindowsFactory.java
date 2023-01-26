package abstractfactory.factory;

import abstractfactory.components.Button;
import abstractfactory.components.CheckBox;
import abstractfactory.components.TextEdit;
import abstractfactory.components.windows.WindowsButton;
import abstractfactory.components.windows.WindowsCheckBox;
import abstractfactory.components.windows.WindowsTextEdit;

public class WindowsFactory implements ComponentFactory {
    @Override
    public Button createButton(String caption) {
        return new WindowsButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new WindowsCheckBox(isChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new WindowsTextEdit(value);
    }
}
