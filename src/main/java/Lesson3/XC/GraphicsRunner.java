//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Container;
import javax.swing.JFrame;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
public class GraphicsRunner extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner() {
		super("Graphics Runner");

		setSize(WIDTH, HEIGHT);

		Container contentPane = getContentPane();

		contentPane.add(new SmileyFace());

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GraphicsRunner run = new GraphicsRunner();
	}
}