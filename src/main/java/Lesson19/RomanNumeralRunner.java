public class RomanNumeralRunner {
    public static void main(String[] args) {
        RomanNumeral test = new RomanNumeral(10);
        System.out.println("10 is " + test);

        test.setNumber(100);
        System.out.println("100 is " + test);

        test.setNumber(1000);
        System.out.println("1000 is " + test);

        test.setNumber(2500);
        System.out.println("2500 is " + test);

        test.setNumber(1500);
        System.out.println("1500 is " + test);

        test.setNumber(23);
        System.out.println("23 is " + test);

        test.setNumber(38);
        System.out.println("38 is " + test);

        test.setNumber(49);
        System.out.println("49 is " + test);

        test.setRoman("LXXVII");
        System.out.println("LXXVII is " + test);

        test.setRoman("XLIX");
        System.out.println("XLIX is " + test);

        test.setRoman("XX");
        System.out.println("XX is " + test);

        RomanNumeral rOne = new RomanNumeral("XXI");
        RomanNumeral rTwo = new RomanNumeral("XXV");

        System.out.println("\nRoman 1 :: " + rOne.toString());
        System.out.println("\nRoman 2 :: " + rTwo.toString());

        System.out.println("\nrOne.equals(rTwo) :: " + rOne.equals(rTwo));

        System.out.println("\nrOne.compareTo(rTwo) :: " + rOne.compareTo(rTwo));
        System.out.println("\nrTwo.compareTo(rOne) :: " + rTwo.compareTo(rOne));
    }
}
