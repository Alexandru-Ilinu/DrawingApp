package model;

public class Rectangle {

	public final int width;
	public final int height;
	public final int x;
	public final int y;

	/**
	 * @param x >= 0
	 * @param y >= 0
	 * @param width >= 0
	 * @param height >= 0
	 */
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Rectangle() {
		this(0, 0);
	}

}