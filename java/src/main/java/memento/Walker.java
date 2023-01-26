package memento;

import java.util.ArrayList;

public class Walker {
    private int currentX, currentY; // 현재 위치
    private int targetX, targetY; // 목표 위치
    private ArrayList<Action> actionList = new ArrayList<>(); // List 는 clone 메소드가 protected 이지만 ArrayList 는 public

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(Action action) {
        actionList.add(action);

        switch (action) {
            case UP:
                currentY += 1;
                break;
            case RIGHT:
                currentX += 1;
                break;
            case DOWN:
                currentY -= 1;
                break;
            case LEFT:
                currentX -= 1;
                break;
        }

        // 현재 좌표에서 목표 좌표까지의 거리 반환
        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    // inner class 로 walker 객체만이 생성하고 소유할 수 있다.
    public class Memento {
        private int x, y;
        private ArrayList<Action> actionList;
        private Memento() {}
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<Action>) this.actionList.clone(); // walker 의 actionList 가 변경되면 같이 변경되지 않게 하기 위해 깊은 복사를 한다.

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (ArrayList<Action>) memento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }

    public enum Action {
        UP, DOWN, RIGHT, LEFT
    }
}


