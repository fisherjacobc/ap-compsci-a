//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

/**
 * @author Jacob Fisher
 * @created 12 Sep 2024
 */
class Robot extends Canvas {
   public Robot() // constructor method - sets up the class
   {
      setSize(800, 600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint(Graphics window) {
      head(window);
      upperBody(window);
      lowerBody(window);
   }

   public void head(Graphics window) {
      // head
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);

      // eyes
      window.setColor(Color.GREEN);
      window.fillOval(340, 125, 25, 25);
      window.fillOval(440, 125, 25, 25);

      // nose
      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 25, 10);

      // mouth
      window.drawArc(355, 150, 90, 30, 180, 180);
   }

   public void upperBody(Graphics window) {
      // body rect
      window.setColor(Color.BLUE);
      window.fillRect(330, 225, 150, 100);
      window.setColor(Color.YELLOW);
      window.drawRect(329, 224, 152, 100);

      // arms
      window.setColor(Color.BLACK);
      window.drawLine(250, 200, 330, 225);
      window.drawLine(580, 200, 480, 225);
   }

   public void lowerBody(Graphics window) {
      // body rect
      window.setColor(Color.GRAY);
      window.fillRect(330, 350, 150, 100);
      window.setColor(Color.YELLOW);
      window.drawRect(329, 349, 152, 100);

      // arms
      window.setColor(Color.BLACK);
      window.drawLine(250, 550, 330, 450);
      window.drawLine(580, 550, 480, 450);
   }
}