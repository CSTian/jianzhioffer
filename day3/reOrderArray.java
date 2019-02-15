package day3;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 基本思路
 * for循环数组,将奇偶数字分别存放在两个数组,然后在合并两个数组
 *
 */
public class reOrderArray {
    public static void reOrderArray(int [] array) {
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int evenSign = 0;
        int oddSign = 0;
        for (int i = 0 ; i < array.length ; i ++){
            if (array[i] % 2 == 0){
                even[evenSign] = array[i];
                evenSign++;
            }else{
                odd[oddSign] = array[i];
                oddSign++;
            }
        }
        for (int i = oddSign , j = 0; i < array.length ; i++) {
            odd[i] = even[j];
            j++;
        }
        for (int i = 0;i < array.length ; i++){

            array[i] = odd[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        reOrderArray(array);
        for (int i :array
             ) {
            System.out.println(i);
        }
    }
}
