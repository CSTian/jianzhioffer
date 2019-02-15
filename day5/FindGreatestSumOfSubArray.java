package day5;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {

        int max = -999999;
        for (int i = 0; i < array.length - 1 ; i++) {
            int sum = 0;
            for (int j = i; j < array.length;j++){
                sum = sum + array[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
