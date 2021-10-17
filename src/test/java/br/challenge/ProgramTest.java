package br.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ProgramTest {

    @ParameterizedTest
    @MethodSource("inputs")
    void testInputAndOutput(int [] inputs , int size) {
        final List<int[]> ints = Program.fourNumberSum(inputs, size);
        ints.forEach(ints1 -> System.out.println(Arrays.toString(ints1)));
    }

    private static Stream<Arguments> inputs() {
        return Stream.of(
                Arguments.of(new int[]{4,4,4,4} , 16),
                Arguments.of(new int[]{1, 2, 3, 4,5, 6} , 16),
                Arguments.of(new int[]{7, 6, 4, -1, 1, 2} , 16),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7} , 10),
                Arguments.of(new int[]{5, -5, -2, 2, 3, -3} , 0),
                Arguments.of(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9} , 4),
                Arguments.of(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3} , 30),
                Arguments.of(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5} , 20),
                Arguments.of(new int[]{1, 2, 3, 4, 5} , 100),
                Arguments.of(new int[]{1, 2, 3, 4, 5, -5, 6, -6} , 5),
                Arguments.of(new int[]{1, 2, 2, 3, 4, 5, -5, 6, 6, -6} , 5),
                Arguments.of(new int[]{1, 2, 2, 3, 4, 5, -5, 6, 6, -6 , 5 , 11 , 17 , 3} , 5),
                Arguments.of(new int[]{1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9 , 10 ,11 ,12 ,13 ,14 ,-8 , 15 ,16 , 17 ,18 ,19 ,20 , 21 ,22 ,23 ,24 ,25 , 26 , 27 , 28 } , 10),
                Arguments.of(new int[]{5 ,6 ,7 , -8 } , 10)

        );
    }
}
