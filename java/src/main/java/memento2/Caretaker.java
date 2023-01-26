package memento2;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    /**
     * 이 예시는 불변 객체인 String 을 사용하지만 실무에서는 Object 이므로 clone 으로 deep copy 해야함.
     * 직렬화, 내부클래스가 아닌 동일한 패키지에 선언된 클래스, 객체에 저장/복구 작업을 할 수 있는ㄴ 프록시를 통해 접근할 수도 있는 객체
     */
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("State 1");
        originator.setState("State 2");
        savedStates.add(originator.saveToMemento());

        originator.setState("State 3");
        savedStates.add(originator.saveToMemento());

        originator.setState("State 4");
        originator.restoreFromMemento(savedStates.get(1));
    }
}
