package decorator;

public class DecoratorApplication {
    /**
     * 기능을 마치 장식처럼 계속 추가할 수 있는 패턴
     * 기능을 실행 중에 동적으로 변경 또는 확장 할 수 있는 패턴
     */

    public static void main(String[] args) {
        var strings = new Strings();
        strings.addStrings("Hello~");
        strings.addStrings("Lorem ipsum");
        strings.addStrings("Lorem ipsum too~");
        strings.addStrings("Good Bye~");

        strings.print();
        System.out.println();

        Decorator decorator = new SideDecorator(strings, '\"');
        decorator.print();
        System.out.println();

        decorator = new LineNumberDecorator(decorator);
        decorator.print();
        System.out.println();

        decorator = new BoxDecorator(decorator);
        decorator.print();
    }
}
