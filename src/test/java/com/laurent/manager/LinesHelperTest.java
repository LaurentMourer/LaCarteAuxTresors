package com.laurent.manager;

import com.google.common.collect.Lists;
import com.laurent.utils.LinesHelper;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LinesHelperTest {

    @Test
    public void test_getLines() {
        // GIVEN
        final StringBuilder stringBuilder = new StringBuilder();
        final String lines = stringBuilder.append("A - B - C - D ")
                .append("\n")
                .append("A - C - E - F")
                .append("\n")
                .append("C - T - F - D")
                .toString();


        final String delimiter = "-";
        // WHEN
        final List<List<String>> actual = LinesHelper.getLines(lines, delimiter);


        // THEN

        final ArrayList<ArrayList<String>> expected = Lists.newArrayList(Lists.newArrayList("A", "B", "C", "D"),
                Lists.newArrayList("A", "C", "E", "F"),
                Lists.newArrayList("C", "T", "F", "D"));

        Assertions.assertThat(actual).isEqualTo(expected);


    }
}