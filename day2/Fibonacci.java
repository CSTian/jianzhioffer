package day2;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */

public class Fibonacci {

    public static int Fibonacci(int n) throws Exception {

        if(n < 0){
            throw new Exception("输入数字非法");
        }
        int[] result = new int[100];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2;i <= n;i ++){
                result[i] = result[i - 1] + result[i - 2];
        }

        return result[n];
    }

    public static void main(String[] args) throws Exception{
        System.out.println(Fibonacci(10));

    }
}
