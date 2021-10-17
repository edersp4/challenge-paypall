package br.challenge;

import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     * @author Ederson da Silva
     *
        In this case we consider duplicity
     */
    public static List<int[]> fourNumberSum(int[] array, int targetSum) {
        final ArrayList<int[]> result = new ArrayList<>();

        for (int level1 = 0; level1 < array.length -3; level1++) {
            for (int level2 = level1 + 1; level2 < array.length -2; level2++) {
                for (int level3 = level2 + 1; level3 < array.length - 1; level3++){
                    for (int level4 = level3 + 1; level4 < array.length; level4++) {
                        if(array[level1] + array[level2] + array[level3] + array[level4] == targetSum ){
                            result.add(new int[]{array[level1], array[level2], array[level3], array[level4]});
                        }
                    }
                }
            }
        }

        return result;
    }


}
