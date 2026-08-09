package model;

public class DrawingLogic {

    public void onStart() {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 5, 5, 6);
        Rectangle r3 = new Rectangle(4, 3);
        Rectangle r4 = new Rectangle(new Point(5, 0));
        Rectangle r5 = new Rectangle(new Point(7, 0), new Dimension(4, 3));
        Rectangle r6 = new Rectangle(new Point(5, 2), 1, 2);

        Rectangle[] rectangles = { r1, r2, r3, r4, r5, r6 };
        new DrawingEngine().draw(rectangles);
    }

}
