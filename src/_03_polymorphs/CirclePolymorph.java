package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	double circleCounter;
	CirclePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		
		setX(int)(getX()+Math.cos(circleCounter)*100.0));
		setY(int)(getY()+Math.sin(circleCounter)*100.0));
		circleCounter++;
	}
	
}
