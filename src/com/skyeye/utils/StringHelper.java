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
 * �ַ�����صĹ�����
 * 1. UUID����
 * 2. ��������Լ���֤
 * 3. ���β���������
 * 
 */
public class StringHelper {

	private static MessageDigest digest;
	
	// ����Ψһ��ʶ��
	public static String getUuid() {
		
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	// ������λ�ļ��β���
	public static String getSalt() {
		
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
	}
	
	// ������ж�Ӧ�ļ��ܣ�MD5 + Base64 ���л�ϼ��ܣ�
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
	
	// У�������Ƿ���ȷ���������룬 ���β����� ���ݿ��ŵ����룩
	public static boolean confirmPasswd(String passwd, String salt, String encrpytPasswd) {
		
		String encrypt = encryptPasswd(passwd, salt);
		if(encrypt.equals(encrpytPasswd))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		// �������ʵ��
		System.out.println(encryptPasswd("abc123", "salt12"));
		// UUID����
		System.out.println(getUuid());
		// ���β�������
		System.out.println(getSalt());
	}
}
