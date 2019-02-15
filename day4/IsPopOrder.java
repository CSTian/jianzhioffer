package day4;

import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        if(pushA.length != popA.length){
            return false;
        }
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            if (pushA[i] == popA[j]){
                stack.pop();
                j++;
            }
        }
        while (!stack.isEmpty()){
            if(popA[j] == stack.pop()){
                j++;
            }
            else return false;
        }
        return true;
    }
}
