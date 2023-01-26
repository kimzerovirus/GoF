package memento2;

import memento.Walker;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Saving to Memento.");
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento");
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }

        public String getState() {
            return state;
        }
    }
}
