//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
public class GraphicsRunner extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner(Component component) {
		super("Graphics Runner - " + component.getClass().getName());

		setSize(WIDTH, HEIGHT);

		Container contentPane = getContentPane();

		contentPane.add(component);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		// new GraphicsRunner(new SmileyFace());
		// new GraphicsRunner(new BigHouse());
		// new GraphicsRunner(new Robot());
		new GraphicsRunner(new ShapePanel());
	}
}