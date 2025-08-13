public class RomanNumeral implements Comparable<RomanNumeral> {
    private Integer number;
    private String romanNumeral;

    private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private final static String[] ROMAN_NUMERALS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
            "I" };

    public RomanNumeral(String romanNumeral) {
        this.setRoman(romanNumeral);
    }

    public RomanNumeral(Integer number) {
        this.setNumber(number);
    }

    public void setNumber(Integer number) {
        String result = "";

        for (int i = 0; i < NUMBERS.length; i++) {
            while (number >= NUMBERS[i]) {
                result += ROMAN_NUMERALS[i];
                number -= NUMBERS[i];
            }
        }

        this.romanNumeral = result;
    }

    public void setRoman(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            if (i % 2 == 0) {
                while (romanNumeral.length() > 0 && romanNumeral.substring(0, 1).equals(ROMAN_NUMERALS[i])) {
                    result += NUMBERS[i];
                    romanNumeral = romanNumeral.substring(1);
                }
            } else if (i % 2 != 0 && romanNumeral.length() > 1) {
                while (romanNumeral.length() > 0 && romanNumeral.substring(0, 2).equals(ROMAN_NUMERALS[i])) {
                    result += NUMBERS[i];
                    romanNumeral = romanNumeral.substring(2);
                }
            }
        }

        this.number = result;
    }

    public int getNumber() {
        return number;
    }

    public String getRoman() {
        return romanNumeral;
    }

    public int compareTo(RomanNumeral other) {
        return this.getNumber() - other.getNumber();
    }

    public String toString() {
        return "" + romanNumeral;
    }
}
