package decorator;

public abstract class Decorator extends Printer{
    protected Printer printer;

    public Decorator(Printer printer) {
        this.printer = printer;
    }
}
