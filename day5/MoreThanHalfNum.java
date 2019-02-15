package day5;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length ; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],(map.get(array[i])+1));
            }
        }
        for (int i = 0 ; i <(array.length / 2 + 1) ;i ++){
            if (map.get(array[i]) > (array.length / 2)){
                return array[i];
            }
        }
        return 0;
    }
}
