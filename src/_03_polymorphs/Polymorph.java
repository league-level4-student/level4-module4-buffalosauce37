package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;

	int getX() {
		return this.x;
	}

	void setX() {
		this.x = x;
	}

	int getY() {
		return this.y;
	}

	void setY() {
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
