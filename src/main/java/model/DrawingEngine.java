package model;

import draw.CmdScreen;
import draw.ScreenCoordinates;

public class DrawingEngine {

    private final Screen screen = new CmdScreen();

    public void draw(Rectangle[] rectangles) {

        for (Rectangle rectangle : rectangles) {
            drawRectangle(rectangle);
        }
        screen.display();
    }

    private void drawRectangle(Rectangle rectangle) {

        if (rectangle.height > 0) {
            drawLowerSide(rectangle);
            drawUpperSide(rectangle);
        }
        if (rectangle.width > 0) {
            drawLeftSide(rectangle);
            drawRightSide(rectangle);
        }
    }

    private void drawLowerSide(Rectangle rectangle) {
        int x1 = rectangle.x;
        int x2 = rectangle.x + rectangle.width - 1;
        drawHorizontalLine(rectangle.y, x1, x2);
    }

    private void drawUpperSide(Rectangle rectangle) {
        int x1 = rectangle.x;
        int x2 = rectangle.x + rectangle.width - 1;
        int y = rectangle.y + rectangle.height - 1;
        drawHorizontalLine(y, x1, x2);
    }

    private void drawLeftSide(Rectangle rectangle) {
        int y2 = rectangle.y + rectangle.height - 1;
        drawVerticalLine(rectangle.x, rectangle.y, y2);
    }

    private void drawRightSide(Rectangle rectangle) {
        int x = rectangle.x + rectangle.width - 1;
        int y1 = rectangle.y;
        int y2 = rectangle.y + rectangle.height - 1;
        drawVerticalLine(x, y1, y2);
    }

    private void drawHorizontalLine(int y, int x1, int x2) {
        for (int x = x1; x <= x2; x++) {
            screen.dot(x, y);
        }
    }

    private void drawVerticalLine(int x, int y1, int y2) {
        for (int y = y1; y <= y2; y++) {
            screen.dot(x, y);
        }
    }
}
