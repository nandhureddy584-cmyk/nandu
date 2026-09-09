package com.nt.service1;

public class StringUtil {

	public boolean isPalindrome(String str) {
     StringBuilder builder=new StringBuilder(str);
     System.out.println(str+"...."+builder);
     return builder.reverse().toString().equals(str);
}
}
