package command;

public class ColorCommand implements Command {
    private Color color;

    public ColorCommand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color.getCode());
    }


}
