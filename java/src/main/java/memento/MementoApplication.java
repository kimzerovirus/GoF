package memento;

import java.util.Random;

public class MementoApplication {
    /**
     * memento = 추억, 과거의 기억
     *
     * 객체의 상태를 기억해 두었다가 필요할 때 기억해둔 상태로 객체를 되돌린다.
     * 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근 가능해야 한다.
     * 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 가질 수 있다.
     */

    public static void main(String[] args) {
        var walker = new Walker(0, 0, 0, 0);
        Action[] actions = {Action.UP, Action.RIGHT, Action.DOWN, Action.LEFT};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while (true) {
            var action = actions[random.nextInt(4)];
            var distance = walker.walk(action);
            System.out.println(action + " " + distance);

            if (distance == 0.0) {
                break;
            }

            if (minDistance > distance) {
                minDistance = distance;
                memento = walker.createMemento();
            } else {
                if (memento != null) {
                    walker.restoreMemento(memento);
                }
            }
        }
    }
}
