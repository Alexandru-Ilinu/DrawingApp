package model;

import model.drawings.DraftDrawing;

public class MainLogic {

    public void onStart() {
        Drawing drawing = new DraftDrawing();
        DrawingEngine drawingEngine = new DrawingEngine();
        drawingEngine.draw(drawing.getRectangles());
    }

}
