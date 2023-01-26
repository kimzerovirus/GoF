package decorator;

public class BoxDecorator extends Decorator {
    public BoxDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public int getLinesCount() {
        return printer.getLinesCount() + 2;
    }

    @Override
    public int getMaxLength() {
        return printer.getMaxLength() + 2;
    }

    @Override
    public int getLength(int index) {
        return printer.getLength(index) + 2;
    }

    @Override
    public String getString(int index) {
        int maxWidth = getMaxLength();
        if (index == 0 || index == getLinesCount() - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append("-".repeat(Math.max(0, maxWidth - 2)));
//            for (int i = 0; i < maxWidth - 2; i++) {
//                sb.append('-');
//            }
            sb.append('+');
            return sb.toString();
        }else {
            return '|' + printer.getString(index - 1) + makeTailString(maxWidth - getLength(index - 1));
        }
    }

    private String makeTailString(int count) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(Math.max(0, count)));
        sb.append('|');
        return sb.toString();
    }
}
