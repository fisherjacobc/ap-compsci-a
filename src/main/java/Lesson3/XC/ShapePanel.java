//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
public class ShapePanel extends JPanel {
	public ShapePanel() {
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	/*
	 * All of your test code should be placed in paint.
	 */
	public void paint(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

		// instantiate a Shape
		// tell your shape to draw
		new Shape(100, 100, 100, 100, 10, Color.RED).draw(window);

		// instantiate a Shape
		// tell your shape to draw
		new Shape(250, 300, 100, 100, 0, Color.GREEN).draw(window);

		// instantiate a Shape
		// tell your shape to draw
		new Shape(450, 150, 100, 150, 5, Color.BLUE).draw(window);
	}
}