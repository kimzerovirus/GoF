package prototype;

public class PrototypeApplication {
    /**
     * 실행 중에 생성된 객체로 다른 객체를 생성하는 패턴
     * Prototype 으로 만든 객체의 상태를 변경해도 원본 객체의 상태는 변경되지 않음(Deep Copy) - 원본과 서로 다른 메모리에 적재
     *
     * 프로토타입 패턴에서는 깊은 복사를 구현해주는게 중요한듯
     */

    public static void main(String[] args) {
        var pt1 = new Point();
        pt1.setX(0).setY(0);
        System.out.println(pt1.draw());

        var pt2 = new Point();
        pt2.setX(100).setY(0);
        System.out.println(pt2.draw());

        var line1 = new Line();
        line1.setStartPoint(pt1).setEndPoint(pt2);
        System.out.println(line1.draw());

        var lineCopy = (Line) line1.copy();

        var pt3 = new Point().setX(100).setY(100);
        var pt4 = new Point().setX(0).setY(100);

        var line2 = new Line().setStartPoint(pt2).setEndPoint(pt3);
        var line3 = new Line().setStartPoint(pt3).setEndPoint(pt4);
        var line4 = new Line().setStartPoint(pt4).setEndPoint(pt1);

        var rect = new Group("RECT");
        rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
        System.out.println(rect.draw());

        var cloneRect = (Group) rect.copy();
        cloneRect.moveOffset(100, 100);

        System.out.println(cloneRect.draw());
        System.out.println(rect.draw());
    }
}
