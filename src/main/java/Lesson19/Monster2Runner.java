public class Monster2Runner {
    public static void main(String[] args) {
        Monster2 zero = new Monster2();
        Monster2 one = new Monster2(8);
        Monster2 sue = new Monster2(9, 4);
        Monster2 harry = new Monster2(1, 2, 3);

        System.out.println("\nzero Monster :: " + zero);
        System.out.println("\none Monster :: " + one);
        System.out.println("\nsue Monster :: " + sue);
        System.out.println("\nharry Monster :: " + harry);

        System.out.println("\n Changing Harry's Properties");
        harry.setHeight(7);
        harry.setWeight(6);
        harry.setAge(5);
        System.out.println("\nharry Monster :: " + harry);

        System.out.println("\nCloning Harry");
        sue = (Monster2) harry.clone();
        System.out.println("\nsue Monster :: " + sue);

        Monster2 mOne = new Monster2(33, 33, 11);
        Monster2 mTwo = new Monster2(55, 33, 11);

        System.out.println("\nMonster 1 :: " + mOne);
        System.out.println("\nMonster 2 :: " + mTwo);

        System.out.println("\nmOne.equals(mTwo) :: " + mOne.equals(mTwo));

        System.out.println("\nmOne.compareTo(mTwo) :: " + mOne.compareTo(mTwo));
        System.out.println("\nmTwo.compareTo(mOne) :: " + mTwo.compareTo(mOne));
    }
}
