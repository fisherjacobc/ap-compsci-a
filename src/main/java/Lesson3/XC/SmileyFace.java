//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
public class SmileyFace extends Canvas {
   public SmileyFace() // constructor - sets up the class
   {
      setSize(800, 600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint(Graphics window) {
      smileyFace(window);
   }

   public void smileyFace(Graphics window) {
      // circle bg
      window.setColor(Color.YELLOW);
      window.fillOval(200, 100, 400, 400);

      // eyes
      window.setColor(Color.GREEN);
      window.fillOval(265, 200, 70, 50);
      window.fillOval(465, 200, 70, 50);

      // nose
      window.setColor(Color.BLACK);
      window.fillOval(375, 300, 50, 50);

      // mouth
      window.drawArc(300, 350, 200, 100, 180, 180);
   }
}