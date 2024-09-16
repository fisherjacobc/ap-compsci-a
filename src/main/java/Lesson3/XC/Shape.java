//(c) A+ Computer Science
//www.apluscompsci.com

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
   // instance variables
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   private int arc;
   private Color color;

   public Shape(int x, int y, int wid, int ht, int a, Color col) {
      xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      arc = a;
      color = col;
   }

   public void draw(Graphics window) {
      window.setColor(color);
      window.fillRoundRect(xPos, yPos, width, height, arc, arc);

      window.setColor(Color.WHITE);
      window.fillRoundRect(xPos + 5, yPos + 5, width - 10, height - 10, arc, arc);

      window.setColor(color);
      window.fillOval(xPos + 15, yPos + 15, width - 30, height - 30);

      window.setColor(Color.WHITE);
      window.fillRect(xPos + 25, yPos + 30, width - 50, height - 60);
   }

   public void setX(int x) {
      xPos = x;
   }

   public void setY(int y) {
      yPos = y;
   }

   public void setWidth(int wid) {
      width = wid;
   }

   public void setHeight(int ht) {
      height = ht;
   }

   public void setArc(int a) {
      arc = a;
   }

   public void setColor(Color col) {
      color = col;
   }

   public int getX() {
      return xPos;
   }

   public int getY() {
      return yPos;
   }

   public int getWidth() {
      return width;
   }

   public int getHeight() {
      return height;
   }

   public int getArc() {
      return arc;
   }

   public Color getColor() {
      return color;
   }

   public String toString() {
      return xPos + " " + yPos + " " + width + " " + height + " " + color;
   }
}