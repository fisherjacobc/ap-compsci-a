//(c) A+ Computer Science
//www.apluscompsci.com

/**
 * @author Jacob Fisher
 * @created 29 Aug 2024
 */
public class StarsAndStripes {
   public StarsAndStripes() {
      System.out.println("StarsAndStripes");
   }

   public void printTwentyStars() {
      System.out.println("********************");
   }

   public void printTwentyDashes() {
      System.out.println("--------------------");
   }

   public void printTwoBlankLines() {
      System.out.println("                    ");
      System.out.println("                    ");
   }

   public void printASmallBox() {
      this.printTwoBlankLines();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyDashes();
   }

   public void printABigBox() {
      this.printTwoBlankLines();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyStars();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyStars();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyStars();
      this.printTwentyDashes();
      this.printTwentyStars();
      this.printTwentyStars();
      this.printTwentyDashes();
   }
}