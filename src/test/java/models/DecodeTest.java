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
    @Test
    public void newDecode_getKey() {
        Decode testDecode = new Decode("abc", 1);
        assertEquals(1, testDecode.getKey());
    }
    @Test
    public void newDecode_Encrypt_Message() {
        Decode testEncode = new Decode("bcd", 1);
        assertEquals("abc", testEncode.strDecrypt());
    }
    @Test
    public void newDecode_LessThan_A() {
        Decode testEncode = new Decode("a", 1);
        assertEquals("z", testEncode.strDecrypt());
    }
}