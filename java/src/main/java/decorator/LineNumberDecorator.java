package decorator;

public class LineNumberDecorator extends Decorator{
    public LineNumberDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public int getLinesCount() {
        return printer.getLinesCount();
    }

    @Override
    public int getMaxLength() {
        return printer.getMaxLength() + 4;
    }

    @Override
    public int getLength(int index) {
        return printer.getLength(index) + 4;
    }

    @Override
    public String getString(int index) {
        return String.format("%02d", index) + ": " + printer.getString(index);
    }
}
