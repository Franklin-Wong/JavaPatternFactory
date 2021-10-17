package com.prototypepattern;

import java.util.Random;

public class Client {
	//�˵�����
	private static int MAX_COLUME =  6;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		thingClient();
//		mailCient();
	}
	
	public static void  thingClient() throws CloneNotSupportedException{
		Thing thing = new Thing();
		Thing cloneThing = thing.clone();
		
	}
	
	public static void  mailCient() throws CloneNotSupportedException {
		int i = 0;
		//ģ���ʼ�����
		Mail mail = new Mail(new AdvTemplet());
		mail.setTail("XX���а�Ȩ����");
		while(i < MAX_COLUME ){
			//ʵ�ֶ�̬����
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRanderingLength(5)+"������ Ůʿ��");
			cloneMail.setReceiver(getRanderingLength(5)+"@"+getRanderingLength(8)+".com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail){
		System.out.println("���⣺ "+mail.getSubject() + "\t�ռ��ˣ�"+mail.getReceiver()+"\t...���ͳɹ��� ");
	}
	
	//���ָ�����ȵ�����ַ���
	public static String getRanderingLength(int maxLength){
		String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
			
		}
		return sb.toString();
		
		
	}
	
	
}
