package com.manju.java.cpt8.ood.hashtable;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1Hex {
	public static String makeSHA1Hash(String input)
			throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA1");
		md.reset();
		byte[] buffer = input.getBytes();
		md.update(buffer);
		byte[] digest = md.digest();

		String hexStr = "";
		for (int i = 0; i < digest.length; i++) {
			hexStr += Integer.toString((digest[i] & 0xff) + 0x100, 16)
					.substring(1);
		}
		return hexStr;
	}

	public static Integer getHashInteger(Object obj){
		  int hash = 1;
	       hash = hash * 31 + obj.hashCode();
	       return hash;
	}
	
	
}
