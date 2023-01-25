package composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {
    private final LinkedList<Unit> unitList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected int getSize() {
        int size = 0;

        for (Unit unit : unitList) {
            size += unit.getSize();
        }

        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    public void printList() {
        list("", this);
    }

    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> iter = dir.unitList.iterator();
            System.out.println(indent + "+ " + unit);
            while (iter.hasNext()) {
                list(indent + "   ", iter.next()); // 재귀
            }
        }
    }
}
