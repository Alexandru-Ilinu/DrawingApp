package model;

/**
 model.Rectangle class is used to represent and draw a rectangle.
 */
public class Rectangle {

	public final int width;
	public final int height;
	public final int x;
	public final int y;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * constructs a rectangle
	 * @param width width of the rectangle, must be >= 0
	 * @param height height of the rectangle, must be >= 0
	 */
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Rectangle() {
		this(0, 0);
	}

}