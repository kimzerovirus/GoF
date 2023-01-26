package visitor;

import java.util.ArrayList;

public class ItemList implements Unit{
    private ArrayList<Unit> list = new ArrayList<>();

    public void add(Unit unit) {
        list.add(unit);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Unit unit : list) {
            visitor.visit(unit);
        }
    }
}
