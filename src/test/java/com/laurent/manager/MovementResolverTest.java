package com.laurent.manager;

import com.laurent.domain.Orientation;
import com.laurent.domain.Position;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MovementResolverTest {


    @Test
    public void test_moveForward() {

        // GIVEN
        final Orientation orientation = Orientation.N;
        final Position position = new Position(1, 2);

        //WHEN
        final Position actual = MovementResolver.moveForward(orientation, position);

        // THEN
        final Position expected = new Position(1, 1);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void test_moveRight() {
        // GIVEN
        final Orientation orientation = Orientation.N;

        //WHEN
        final Orientation actual = MovementResolver.moveRight(orientation);

        // THEN
        final Orientation expected = Orientation.E;

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void test_moveLeft() {
        // GIVEN
        final Orientation orientation = Orientation.N;

        //WHEN
        final Orientation actual = MovementResolver.moveLeft(orientation);

        // THEN
        final Orientation expected = Orientation.O;

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}