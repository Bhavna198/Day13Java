package com.bridgelabz;

public class TestMaximum<T extends Comparable> {
    T num1, num2, num3;                  //Class Level variable

    /**
     * Making one method name as TestMaximum.
     *
     * @param num1 first num
     * @param num2 second num
     * @param num3 third num
     */

    public TestMaximum(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    /**
     * To get the Maximum variables use another method.
     */

    private void max() {
        TestMaximum.getMaximum(num1, num2, num3);
    }

    /**
     * To compare the variables
     *
     * @param x integer first variable
     * @param y integer second variable
     * @param z integer third variable
     */

    private static <T extends Comparable> void getMaximum(T x, T y, T z) {

        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        System.out.println("Maximum Value :: " + max);

    }

    public static void main(String[] args) {

        System.out.println("Find the Maximum number using Generics concept.");
        Integer x = 90, y = 04, z = 23;
        Float x1 = 2.9f, y1 = 1.1f, z1 = 0.9f;
        String x2 = "Bhavna", y2 = "Shende", z2 = "Bhindi";

        /**
         * Making the constuctor to fetch the value.
         * Taking 3 integers, Float values and string.
         */

        new TestMaximum<>(x, y, z).max();
        new TestMaximum<>(x1, y1, z1).max();
        new TestMaximum<>(x2, y2, z2).max();
    }
}
