package model;

import java.util.List;

abstract class Drawing {

    public final Resolution resolution;

    public Drawing(Resolution resolution) {
        this.resolution = resolution;
    }

    public abstract List<Rectangle> getRectangles();

}
