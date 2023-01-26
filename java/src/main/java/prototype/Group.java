package prototype;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Shape, Prototype{
    private ArrayList<Shape> shapeList = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    Group addShape(Shape shape) {
        shapeList.add(shape);
        return this;
    }

    @Override
    public Object copy() {
        Group newGroup = new Group(name);
        for (Shape value : shapeList) {
            var shape = (Prototype) value;
            newGroup.shapeList.add((Shape) shape.copy());
        }

        return newGroup;
    }

    @Override
    public String draw() {
        StringBuilder result = new StringBuilder(name);
        result.append("(");

        var iter = shapeList.iterator();
        while (iter.hasNext()) {
            var shape = iter.next();
            result.append(shape.draw());
            if(iter.hasNext()) result.append(" ");
        }
        return result.append(")").toString();
    }

    @Override
    public void moveOffset(int dx, int dy) {
        for (Shape shape : shapeList) {
            shape.moveOffset(dx, dy);
        }
    }
}
