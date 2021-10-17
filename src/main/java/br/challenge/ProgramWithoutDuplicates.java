package br.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramWithoutDuplicates {


    /**
     * @author Ederson da Silva
     * In this case we remove duplicity
     */
    public static List<int[]> fourNumberSum(int[] array, int targetSum) {
        final int[] distinct = Arrays.stream(array).distinct().toArray(); // use the distinct to remove duplicities

        List<int[]> result = new ArrayList<>();
        for (int level1 = 0; level1 < distinct.length -3; level1++) {
            for (int level2 = level1 + 1; level2 < distinct.length -2; level2++) {
                for (int level3 = level2 + 1; level3 < distinct.length - 1; level3++){
                    for (int level4 = level3 + 1; level4 < distinct.length; level4++) {
                        if(distinct[level1] + distinct[level2] + distinct[level3] + distinct[level4] == targetSum ){
                            result.add(new int[]{distinct[level1], distinct[level2], distinct[level3], distinct[level4]});
                        }
                    }
                }
            }
        }
        return result;
    }




}
