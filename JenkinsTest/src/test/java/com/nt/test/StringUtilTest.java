package com.nt.test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.nt.service1.StringUtil;
public class StringUtilTest {
private static StringUtil util;

    @BeforeAll
	public static void setupOnce() {
		util=new StringUtil();
    }
    @Test
    public void isPalindromePositive() {
    	assertTrue(util.isPalindrome("madam"));
    	
    }
    @Test
    public void isPalindromeNegative() {
    	assertFalse(util.isPalindrome("madam1"));
    	
}
}
