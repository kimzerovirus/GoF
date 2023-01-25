package singleton;

public class King {
    private King() {

    }

    private static King self = null;

    public synchronized static King getInstance() {
        // multi thread 에서 동기화 - synchronized
        if (self == null) {
            self = new King();
        }
        return self;
    }

    public void say(){
        System.out.println("King is only One!");
    }
}
