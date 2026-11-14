package model;

import draw.CmdCanvas;
import java.util.List;

class DrawingEngine {

    private final Canvas canvas;

    public DrawingEngine(Resolution resolution) {
        canvas = new CmdCanvas(resolution);
    }

    public void draw(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            drawRectangle(rectangle);
        }
        canvas.display();
    }

    private void drawRectangle(Rectangle rectangle) {

        if (rectangle.getHeight() > 0) {
            drawUpperSide(rectangle);
            drawLowerSide(rectangle);
        }
        if (rectangle.getWidth() > 0) {
            drawLeftSide(rectangle);
            drawRightSide(rectangle);
        }
    }

    private void drawUpperSide(Rectangle rectangle) {
        int x1 = rectangle.x;
        int x2 = rectangle.x + rectangle.getWidth() - 1;
        drawHorizontalLine(rectangle.y, x1, x2);
    }

    private void drawLowerSide(Rectangle rectangle) {
        int x1 = rectangle.x;
        int x2 = rectangle.x + rectangle.getWidth() - 1;
        int y = rectangle.y + rectangle.getHeight() - 1;
        drawHorizontalLine(y, x1, x2);
    }

    private void drawLeftSide(Rectangle rectangle) {
        int y2 = rectangle.y + rectangle.getHeight() - 1;
        drawVerticalLine(rectangle.x, rectangle.y, y2);
    }

    private void drawRightSide(Rectangle rectangle) {
        int x = rectangle.x + rectangle.getWidth() - 1;
        int y1 = rectangle.y;
        int y2 = rectangle.y + rectangle.getHeight() - 1;
        drawVerticalLine(x, y1, y2);
    }

    private void drawHorizontalLine(int y, int x1, int x2) {
        for (int x = x1; x <= x2; x++) {
            canvas.dot(x, y);
        }
    }

    private void drawVerticalLine(int x, int y1, int y2) {
        for (int y = y1; y <= y2; y++) {
            canvas.dot(x, y);
        }
    }
}
