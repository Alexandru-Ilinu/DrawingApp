package model;

public class DrawingLogic {

    public void onStart() {

        Rectangle r1, r2;

        r1 = new Rectangle();
        r2 = new Rectangle(0, 0, 10, 20);

        Rectangle[] rectangles = { r1, r2 };
        new DrawingEngine().draw(rectangles);
    }

}
