//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * @author Jacob Fisher
 * @created 09 Oct 2024
 */
public class MouseButtonTester extends JFrame implements MouseListener {
	private int mouseX, mouseY;
	private int mouseButton;
	private boolean isFirstRun;
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	private static final long serialVersionUID = 0; // use this if you do not like warnings

	public MouseButtonTester() {
		super("Mouse Button Tester");

		// set up all variables
		mouseX = mouseY = 0;
		mouseButton = 0;
		isFirstRun = true;

		// set up the Frame
		setSize(WIDTH, HEIGHT);
		setBackground(Color.WHITE);
		setVisible(true);

		// start trapping for mouse clicks
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		mouseButton = e.getButton();
		repaint();
	}

	public void paint(Graphics window) {
		if (isFirstRun) {
			window.setColor(Color.WHITE);
			window.fillRect(0, 0, WIDTH, HEIGHT);

			this.isFirstRun = false;
		}

		window.setFont(new Font("TAHOMA", Font.BOLD, 12));
		window.setColor(Color.BLUE);
		window.drawString("MOUSE BUTTON TESTER", 420, 55);

		draw(window);
	}

	public void draw(Graphics window) {

		System.out.println(mouseButton == MouseEvent.BUTTON1);
		if (mouseButton == MouseEvent.BUTTON1) // left mouse button pressed
		{
			// window.drawString("BUTTON1", 50,200); //debug code
			window.setColor(Color.RED);
			window.drawRect(mouseX, mouseY, 10, 10);
		}
		// right mouse button pressed
		else if (mouseButton == MouseEvent.BUTTON3) {
			window.setColor(Color.BLUE);
			window.drawOval(mouseX, mouseY, 10, 10);
		}
		// any other mouse button pressed - clear screen
		else {
			window.setColor(Color.WHITE);
			window.fillRect(0, 0, WIDTH, HEIGHT);

			window.setFont(new Font("TAHOMA", Font.BOLD, 12));
			window.setColor(Color.BLUE);
			window.drawString("MOUSE BUTTON TESTER", 420, 55);
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}