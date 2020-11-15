package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly()throws Exception  {
        Encode testEncode = new Encode("abc", 1);
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getMessage() throws Exception {
        Encode testEncode = new Encode("abc", 1);
        assertEquals("abc", testEncode.getMsg());
    }
    @Test
    public void newEncode_getKey() throws Exception {
        Encode testEncode = new Encode("abc", 1);
        assertEquals(1, testEncode.getKey());
    }
    @Test
    public void newEncode_Encrypt_Message()throws Exception  {
        Encode testEncode = new Encode("abc", 1);
        assertEquals("bcd", testEncode.strEncrypt());
    }

    @Test
    public void newEncode_GreaterThan_Z() throws Exception {
        Encode testEncode = new Encode("z", 1);
        assertEquals("a", testEncode.strEncrypt());
    }
    @Test
    public void newEncode_Empty_space() throws Exception {
        Encode testEncode = new Encode(" ", 1);
        assertEquals(" ", testEncode.strEncrypt());
    }
}