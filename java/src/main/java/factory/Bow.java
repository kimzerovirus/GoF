package factory;

public class Bow implements Item {
    @Override
    public void use() {
        System.out.println("히히 발싸!");
    }
}
