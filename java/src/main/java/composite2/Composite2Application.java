package composite2;

public class Composite2Application {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse1);
        graphic2.add(ellipse2);

        graphic3.add(ellipse1);

        graphic1.print();
    }
}
