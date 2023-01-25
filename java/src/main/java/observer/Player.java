package observer;

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 상태 변화 - 감시해야할 대상
    public abstract void update(int diceNumber);
}
