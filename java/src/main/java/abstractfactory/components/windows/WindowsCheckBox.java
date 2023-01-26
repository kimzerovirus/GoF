package abstractfactory.components.windows;

import abstractfactory.components.CheckBox;

public class WindowsCheckBox extends CheckBox {
    public WindowsCheckBox(boolean isChecked) {
        super(isChecked);
    }

    @Override
    public void render() {
        System.out.println("Windows 렌더링 API 를 이용해" + (this.isChecked ? "체크된" : "체크 안된") + " 체크박스를 그린다.");
    }
}
