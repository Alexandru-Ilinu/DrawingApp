package draw;

import model.Canvas;
import model.Resolution;

public class CmdCanvas implements Canvas {

    private static final char BLANK = ' ';
    private static final char DOT = '#';

    private final int WIDTH;
    private final int HEIGHT;

    private final char[][] screenContent;

    public CmdCanvas(Resolution resolution) {
        WIDTH = resolution.width();
        HEIGHT = resolution.height();
        screenContent = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                screenContent[i][j] = BLANK;
            }
        }
    }

    @Override
    public void dot(int x, int y) {
        screenContent[y][x] = DOT;
    }

    @Override
    public void display() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                printChar(screenContent[i][j]);
            }
            newline();
        }
    }

    private void printChar(char c) {
        System.out.print(c);
    }

    private void newline() {
        System.out.println();
    }

}
