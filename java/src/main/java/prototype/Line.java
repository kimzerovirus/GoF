package prototype;

public class Line implements Shape, Prototype{
   private Point startPt, endPt;

   public Line setStartPoint(Point pt) {
       startPt = pt;
       return this;
   }

   public Line setEndPoint(Point pt) {
       endPt = pt;
       return this;
   }

    public Point getStartPoint() {
        return startPt;
    }

    public Point getEndPoint() {
        return endPt;
    }

    @Override
    public Object copy() {
        Line newLine = new Line();
        newLine.startPt = (Point) startPt.copy();
        newLine.endPt = (Point) endPt.copy();

        return newLine;
    }

    @Override
    public String draw() {
        return "LINE(" + startPt.draw() + ", " + endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        startPt.moveOffset(dx,dy);
        endPt.moveOffset(dx,dy);
    }
}
