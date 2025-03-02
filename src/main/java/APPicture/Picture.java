import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture() {
    /*
     * not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * 
   * @param height the height of the desired picture
   * @param width  the width of the desired picture
   */
  public Picture(int height, int width) {
    // let the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   * 
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * 
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * 
   * @return a string with information about the picture such as fileName,
   *         height and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() +
        " height " + getHeight()
        + " width " + getWidth();
    return output;

  }

  /** Method to set the blue to 0 */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }

  /** Method to set non-blues to 0 */
  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  /** Method to negate the RGB */
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }

  /** Method to make a picture grayscale */
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
        pixelObj.setRed(avg);
        pixelObj.setGreen(avg);
        pixelObj.setBlue(avg);
      }
    }
  }

  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(pixelObj.getRed() * 6);
        // // pixelObj.setGreen(pixelObj.getGreen() * 3);
        // pixelObj.setBlue(pixelObj.getBlue() / 3);
      }
    }
  }

  /**
   * Method that mirrors the picture around a
   * vertical mirror in the center of the picture
   * from left to right
   */
  public void mirrorVertical() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * Method that mirrors the picture around a
   * vertical mirror in the center of the picture
   * from left to right
   */
  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  /**
   * Method that mirrors the picture around a
   * horizontal mirror in the center of the picture
   * from top to bottom
   */
  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  /**
   * Method that mirrors the picture around a
   * horizontal mirror in the center of the picture
   * from bottom to top
   */
  public void mirrorHorizontalBotToTop() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    }
  }

  /** Mirror just part of a picture of a temple */
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++) {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++) {
        count++;
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }

    System.out.println("\nCount: " + count);
  }

  /** Mirror just the snowman's arms */
  public void mirrorArms() {
    int mirrorPoint = 190;
    Pixel topPixel = null;
    Pixel BottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the columns
    for (int col = 100; col < 300; col++) {
      // loop through the rows
      for (int row = 160; row < mirrorPoint; row++) {
        topPixel = pixels[row][col];
        BottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        BottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  /** Mirror just part the seagull image so there are two next to each other */
  public void mirrorGull() {
    int mirrorPoint = 360;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 220; row < mirrorPoint; row++) {
      // loop through the columns
      for (int col = 220; col < 300; col++) {

        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * 
   * @param fromPic  the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
  public void copy(Picture fromPic,
      int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&
        toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&
          toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /**
   * copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * 
   * @param fromPic  the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   * @param endRow the end row to copy to
   * @param endCol the end col to copy to
   */
  public void copy(Picture fromPic,
      int startRow, int startCol, int endRow, int endCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startRow, toRow = endRow; fromRow < fromPixels.length &&
        toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = startCol, toCol = endCol; fromCol < fromPixels[0].length &&
          toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage() {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1, 0, 0, 5, 0);
    this.copy(flower2, 5, 0, 100, 0);
    this.copy(flower1, 10, 0, 200, 0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue, 15, 0, 300, 0);
    this.copy(flower1, 20, 0, 400, 0);
    this.copy(flower2, 25, 0, 500, 0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

  /** Method to create my collage of several pictures */
  public void myCollage() {
    Picture robot = new Picture("robot.jpg");
    Picture flower1 = new Picture("flower1.jpg");
    this.copy(robot, 0, 0, 5, 0);
    this.copy(flower1, 5, 0, 100, 0);
    this.copy(flower1, 10, 0, 200, 0);
    Picture koalaZeroBlue = new Picture("koala.jpg");
    koalaZeroBlue.zeroBlue();
    this.copy(koalaZeroBlue, 15, 0, 300, 0);
    this.copy(robot, 20, 0, 400, 0);
    this.copy(flower1, 25, 0, 500, 0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }


  /**
   * Method to show large changes in color
   * 
   * @param edgeDist the distance for finding edges
   */
  public void edgeDetection(int edgeDist) {
    Pixel selectedPixel = null;
    Pixel rightPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length - 1; row++) {
      for (int col = 0; col < pixels[0].length - 1; col++) {
        selectedPixel = pixels[row][col];
        rightPixel = pixels[row][col + 1];
        bottomPixel = pixels[row + 1][col];
        bottomColor = bottomPixel.getColor();
        rightColor = rightPixel.getColor();
        if (selectedPixel.colorDistance(rightColor) > edgeDist)
          selectedPixel.setColor(Color.BLACK);
        if (selectedPixel.colorDistance(bottomColor) > edgeDist)
          selectedPixel.setColor(Color.BLACK);
        else
          selectedPixel.setColor(Color.WHITE);
      }
    }
  }

  /*
   * Main method for testing - each class in Java can have a main
   * method
   */
  public static void main(String[] args) {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

} // this } is the end of class Picture, put all new methods before this
