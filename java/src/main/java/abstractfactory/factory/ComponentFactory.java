package abstractfactory.factory;

import abstractfactory.components.Button;
import abstractfactory.components.CheckBox;
import abstractfactory.components.TextEdit;

public interface ComponentFactory {
    Button createButton(String caption);
    CheckBox createCheckBox(boolean isChecked);
    TextEdit createTextEdit(String value);
}

//public abstract class ComponentFactory {
//    abstract Button createButton(String caption);
//    abstract CheckBox createCheckBox(boolean isChecked);
//    abstract TextEdit createTextEdit(String value);
//}
