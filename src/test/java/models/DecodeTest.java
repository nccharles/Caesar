package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode testDecode = new Decode("abc", 1);
        assertEquals(true, testDecode instanceof Decode);
    }
    @Test
    public void newDecode_getMessage() {
        Decode testDecode = new Decode("abc", 1);
        assertEquals("abc", testDecode.getMsg());
    }
}