package abstractfactory;

import abstractfactory.components.Button;
import abstractfactory.components.CheckBox;
import abstractfactory.components.TextEdit;
import abstractfactory.factory.ComponentFactory;
import abstractfactory.factory.WindowsFactory;

public class AbstractFactoryApplication {
    /**
     * 먼저 만들어야할 컴포넌트들을 추상적으로 정하고 어떤 구체적인 상황이 주어지면 각 컴포넌트들을 구체적으로 만드는 패턴
     *
     * 구체적인 윈도우 리눅스 컴포넌트를 확인할 필요 없이
     * 추상 컴포넌트들만 파악해도 추가 기능 개발에 참여하기 쉬워진다.
     */

    public static void main(String[] args) {
        // 운영체제에 종속적이지 않다.
        ComponentFactory factory = new WindowsFactory();
        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.createTextEdit("디자인 패턴");

        button.render();
        checkBox.render();
        textEdit.render();
    }
}
