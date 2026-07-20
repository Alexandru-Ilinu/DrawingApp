package model;

/**
 model.Rectangle class is used to represent and draw a rectangle.
 */
public class Rectangle {

	public final int width;
	public final int height;
	public final int x = 0;
	public final int y = 0;

	/**
	 * constructs a rectangle
	 * @param width width of the rectangle, must be >= 0
	 * @param height height of the rectangle, must be >= 0
	 */
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

}