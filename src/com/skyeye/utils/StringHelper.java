package com.skyeye.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.UUID;

/**
 * 
 * @author Administrator
 * @version 1.0
 * 
 * 字符串相关的工具类
 * 1. UUID生成
 * 2. 密码加密以及验证
 * 3. 加盐参数的生成
 * 
 */
public class StringHelper {

	private static MessageDigest digest;
	
	// 生成唯一标识符
	public static String getUuid() {
		
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	// 生成六位的加盐参数
	public static String getSalt() {
		
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
	}
	
	// 密码进行对应的加密（MD5 + Base64 进行混合加密）
	public static String encryptPasswd(String password, String salt) {
		
		String result = "";
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update((password+salt).getBytes());
			result = new BigInteger(1, digest.digest()).toString();
			result = new String(Base64.getEncoder().encodeToString(result.getBytes()));
		} catch(Exception e) {
			
		} finally {
			return result;
		}
	}
	
	// 校验密码是否正确（明文密码， 加盐参数， 数据库存放的密码）
	public static boolean confirmPasswd(String passwd, String salt, String encrpytPasswd) {
		
		String encrypt = encryptPasswd(passwd, salt);
		if(encrypt.equals(encrpytPasswd))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		// 密码加密实现
		System.out.println(encryptPasswd("abc123", "salt12"));
		// UUID生成
		System.out.println(getUuid());
		// 加盐参数生成
		System.out.println(getSalt());
	}
}
