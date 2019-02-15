package day5;

import java.util.ArrayList;

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k > input.length){
            return result;
        }
        for (int i = 0; i < input.length - 1 ; i++) {
            for (int j = i + 1; j < input.length ; j++) {
                if (input[i] > input[j]){
                    int num = input[i];
                    input[i] = input[j];
                    input[j] = num;
                }
            }

        }

        for (int i = 0; i < k ; i++) {
            result.add(input[i]);
        }
        return result;
    }
}
