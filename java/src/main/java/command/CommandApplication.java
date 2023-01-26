package command;

public class CommandApplication {
    /**
     * 하나의 명령(기능)을 객체화한 패턴
     * 객체는 전달할 수 있고 보관할 수 있음, 즉 명령(기능)을 전달하고 보관할 수 있게 됨
     * 기능을 자유롭게 보관하고 전달할 수 있게 되면 배치 실행이나 우선순위가 높은 명령을 먼저 실행하기 등이 가능해짐
     */

    public static void main(String[] args) {
        CommandGroup cmdGroup = new CommandGroup();

        Command clearCmd = new ClearCommand();
        Command yellowColorCmd = new ColorCommand(Color.YELLOW);
        Command moveCmd = new MoveCommand(10, 1);
        Command printCmd = new PrintCommand("Hello World!!");
        Command cyanColorCmd = new ColorCommand(Color.CYAN);
        Command moveCmd2 = new MoveCommand(15, 1);

        cmdGroup.add(clearCmd);
        cmdGroup.add(yellowColorCmd);
        cmdGroup.add(moveCmd);
        cmdGroup.add(printCmd);
        cmdGroup.add(cyanColorCmd);
        cmdGroup.add(printCmd);
        cmdGroup.add(moveCmd2);

        cmdGroup.run();
    }
}
