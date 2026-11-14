package model;

class Rectangle {

	final int x;
	final int y;
	private final int width;
	private final int height;

	/**
	 * @param x      >= 0
	 * @param y      >= 0
	 * @param width  >= 0
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

	public Rectangle(Point origin) {
		this(origin.x(), origin.y(), 1, 1);
	}

	public Rectangle(Point origin, int width, int height) {
		this(origin.x(), origin.y(), width, height);
	}

	public Rectangle(Point origin, Dimension dimension) {
		this(origin.x(), origin.y(), dimension.width(), dimension.height());
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}