package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode testEncode = new Encode("abc", 1);
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getMessage() {
        Encode testEncode = new Encode("abc", 1);
        assertEquals("abc", testEncode.getMsg());
    }
}