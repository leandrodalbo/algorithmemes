package org.algorithmemes.stringandarrays;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysAndStringsTest {

    @Test
    public void shouldCheckForPermutation() {
        assertThat(ArraysAndStrings.isPermutation("dog", "god")).isTrue();
        assertThat(ArraysAndStrings.isPermutation("dog", " god")).isFalse();
        assertThat(ArraysAndStrings.isPermutation("dog", "cat")).isFalse();
    }

    @Test
    public void shouldCheckForUniqueCharacters() {
        assertThat(ArraysAndStrings.isAllUniqueChars("abca")).isFalse();
        assertThat(ArraysAndStrings.isAllUniqueChars("abbc")).isFalse();
        assertThat(ArraysAndStrings.isAllUniqueChars("abc")).isTrue();
    }
}
