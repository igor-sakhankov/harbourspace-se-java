package com.harbour.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("inputsAndOutputs")
    void isPalindrome(int input, boolean result) {
        assertEquals(result, Solution.isPalindrome(input));
    }

    static Stream<Arguments> inputsAndOutputs() {
        return Stream.of(
            Arguments.of(-12, false),
            Arguments.of(0, true),
            Arguments.of(11, true),
            Arguments.of(12, false),
            Arguments.of(121, true),
            Arguments.of(121121, true),
            Arguments.of(12151211, false)
        );
    }
}
