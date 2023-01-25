package composite2;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private final List<Graphic> childGraphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic childGraphic : childGraphics) {
            childGraphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
