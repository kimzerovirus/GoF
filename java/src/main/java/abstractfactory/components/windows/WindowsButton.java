package abstractfactory.components.windows;

import abstractfactory.components.Button;

public class WindowsButton extends Button {
    public WindowsButton(String caption) {
        super(caption);
    }

    @Override
    public void render() {
        System.out.println("Windows 렌더링 API 를 이용해" + this.caption + " 버튼을 그린다.");
    }
}
