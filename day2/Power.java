package day2;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class Power {
    public static double Power(double base, int exponent) {
        double result = 1;
        if (exponent >= 0){
            while (exponent != 0) {
                result = result * base;
                exponent--;
            }
        }
        else {
            exponent = -1 * exponent;
            while (exponent != 0) {
                result = result * base;
                exponent--;
            }
            result = 1 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,-2));
    }
}