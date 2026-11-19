package model;

class Square extends Rectangle {

    public Square(int d) {
        super(d, d);
    }

    public Square(Point point, int d) {
        super(point, d, d);
    }

}
