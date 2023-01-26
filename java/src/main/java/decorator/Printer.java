package decorator;

public abstract class Printer {
    public abstract int getLinesCount();
    public abstract int getMaxLength();
    public abstract int getLength(int index);
    public abstract String getString(int index);

    public void print() {
        for (int i = 0; i < getLinesCount(); i++) {
            var str = getString(i);
            System.out.println(str);
        }
    }
}
