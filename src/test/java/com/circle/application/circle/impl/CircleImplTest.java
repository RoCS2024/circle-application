package com.circle.application.circle.impl;

import com.circle.application.circle.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleImplTest {

    @Test
    public void testGetCircumference(){
        Circle circle = new Circle(1);
        CircleImpl circleImpl = new CircleImpl();
        assertEquals(circleImpl.computeCircumference(circle), 6.2832);
    }
}