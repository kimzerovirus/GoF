package abstractfactory.components.linux;

import abstractfactory.components.TextEdit;

public class LinuxTextEdit extends TextEdit {
    public LinuxTextEdit(String value) {
        super(value);
    }

    @Override
    public void render() {
        System.out.println("Linux 렌더링 API 를 이용해" + this.value + " 값을 가진 텍스트에디터를 그린다.");
    }
}
