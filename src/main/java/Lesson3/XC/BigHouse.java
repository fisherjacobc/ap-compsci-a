//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
public class BigHouse extends Canvas {
   public BigHouse() // constructor - sets up the class
   {
      setSize(800, 600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint(Graphics window) {
      bigHouse(window);
   }

   public void bigHouse(Graphics window) {
      // roof
      window.setColor(Color.GREEN);
      window.fillRect(50, 50, 600, 100);

      // main house walls
      window.setColor(Color.BLUE);
      window.fillRect(150, 150, 400, 400);

      // door
      window.setColor(Color.WHITE);
      window.fillRect(300, 400, 100, 150);

      // windows
      window.setColor(Color.GREEN);
      window.fillRect(200, 200, 100, 100);
      window.fillRect(400, 200, 100, 100);
   }
}