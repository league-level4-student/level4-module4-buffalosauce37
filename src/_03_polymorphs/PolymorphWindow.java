
package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> morph = new ArrayList<Polymorph>();

	PolymorphWindow() {
morph.add(new BluePolymorph(50, 50));
morph.add(new CirclePolymorph(100, 100));
	}

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		for (int i = 0; i < morph.size(); i++) {
			morph.get(i).draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}
}
