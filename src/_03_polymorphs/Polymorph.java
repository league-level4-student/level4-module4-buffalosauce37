package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;

	protected int width = 50;
	protected int height = 50;

	public int getWidth() {
		return this.width;
	}

	void setWidth(int width) {
		this.width = width;

	}

	public int getHeight() {
		return this.height;
	}

	void setHight(int height) {
		this.height = height;
	}

	int getX() {
		return this.x;
	}

	void setX(int x) {
		this.x = x;
	}

	int getY() {
		return this.y;
	}

	void setY(int y) {
		this.y = y;
	}

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
