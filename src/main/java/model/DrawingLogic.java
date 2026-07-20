package model;

public class DrawingLogic {

    public void onStart() {
        Rectangle[] rectangles = {
                new Rectangle(4, 5),
                new Rectangle(5, 7),
                new Rectangle(4, 5)
        };
        new DrawingEngine().draw(rectangles);
    }

}
