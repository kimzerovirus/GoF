package abstractfactory.factory;

import abstractfactory.components.Button;
import abstractfactory.components.CheckBox;
import abstractfactory.components.TextEdit;
import abstractfactory.components.linux.LinuxButton;
import abstractfactory.components.linux.LinuxCheckBox;
import abstractfactory.components.linux.LinuxTextEdit;

public class LinuxFactory implements ComponentFactory {
    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean isChecked) {
        return new LinuxCheckBox(isChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new LinuxTextEdit(value);
    }
}
