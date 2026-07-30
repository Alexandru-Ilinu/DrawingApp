package draw;

import model.Canvas;

public class CmdCanvas implements Canvas {

    private static final int WIDTH = 100;
    private static final int HEIGHT = 48;

    private static final char BLANK = ' ';
    private static final char DOT = '#';

    private final char[][] screenContent = new char[HEIGHT][WIDTH];

    public CmdCanvas() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                screenContent[i][j] = BLANK;
            }
        }
    }

    @Override
    public void dot(int x, int y) {
        screenContent[HEIGHT - 1 - y][x] = DOT;
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
