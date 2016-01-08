package ru.spb.herzen.ivt3;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    App app;

    public void setUp() {
        app = new App();
    }

    public void testSum()
    {
        assertEquals(app.sum(1, 2), 3);
        assertEquals(app.sum(-1, 2), 1);
        assertEquals(app.sum(1, -2), -1);

        assertEquals(app.sum("test1", "test2"), "test1test2");
    }

    public void testMultiply()
    {
        assertEquals(app.multiply(0, 1), 0);
        assertEquals(app.multiply(0, 2.5f), 0, 0.001);

        assertEquals(app.multiply(3, 2), 6);
        assertEquals(app.multiply(-3, 2), -6);
        assertEquals(app.multiply(3, -2), -6);

        assertEquals(app.multiply(7, 2.3277f), 16.2939f, 0.001);
        assertEquals(app.multiply(2.2f, 2), 4.4f, 0.001);

        assertEquals(app.multiply(1.5f, 2.3f), 3.45f, 0.001);
        assertEquals(app.multiply(1.5f, -2.3f), -3.45f, 0.001);
        assertEquals(app.multiply(-1.5f, 2.3f), -3.45f, 0.001);
    }

    public void testFunction()
    {
        assertEquals(app.function(2), 1, 0.001);
        assertEquals(app.function(0), 0.83333f, 0.001);
        assertEquals(app.function(-8), 0.5f, 0.001);

        assertEquals(app.function(12), Float.POSITIVE_INFINITY, 0.001);
    }
}
