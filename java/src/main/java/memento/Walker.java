package memento;

import java.util.ArrayList;
import java.util.List;

public class Walker implements Cloneable {
    private int currentX, currentY;
    private int targetX, targetY;
    private List<Action> actionList = new ArrayList<>();

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

        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    public class Memento {
        private int x, y;
        private List<Action> actionList;

        private Memento() {
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (List<Action>) this.actionList.clone();

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (List<Action>) memento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
