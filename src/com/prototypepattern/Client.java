package com.prototypepattern;

import java.util.Random;

public class Client {
	//账单数量
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
		//模拟邮件发送
		Mail mail = new Mail(new AdvTemplet());
		mail.setTail("XX银行版权所有");
		while(i < MAX_COLUME ){
			//实现动态代理
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRanderingLength(5)+"先生（ 女士）");
			cloneMail.setReceiver(getRanderingLength(5)+"@"+getRanderingLength(8)+".com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail){
		System.out.println("标题： "+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t...发送成功！ ");
	}
	
	//获得指定长度的随机字符串
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
