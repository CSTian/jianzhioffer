package day4;

import java.util.ArrayList;

public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        if(row == 0 || column == 0){
            return result;
        }
        int layer = (Math.min(row,column)-1)/2 + 1 ;
        for (int i = 0;i < layer; i ++){
            for(int j = i ; j < column - i ; j++){ result.add(matrix[i][j]);}
            for(int j = i + 1; j < row - i ; j++){result.add(matrix[j][column - i - 1]);}
            for(int j = column - i - 2; (j > i - 1) &&(row-i-1!=i) ; j--){result.add(matrix[row - i - 1 ][j]);}
            for(int j = row - i - 2; (j > i)&&(column-i-1!=i)  ; j--){result.add(matrix[j][i]);}

        }
        return result;
    }
}
