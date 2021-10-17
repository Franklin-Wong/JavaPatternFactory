package com.prototypepattern;

public class Mail implements Cloneable{//
	//�ռ���
	private String receiver;
	//�ʼ�����
	private String subject;
	//��ν
	private String appellation;
	//�ʼ�����
	private String contxt;
	//�ʼ���β���� һ�㶼�Ǽ���"XXX��Ȩ����"����Ϣ
	private String tail;
	public Mail(AdvTemplet advTemplet) {
		this.subject = advTemplet.getAdvSubject();
		this.contxt = advTemplet.getAdvContext();
	}
	
	@Override
	protected Mail clone() throws CloneNotSupportedException {
		Mail mail = null;
		mail = (Mail) super.clone();
		return mail;
	}
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public String getContxt() {
		return contxt;
	}
	public void setContxt(String contxt) {
		this.contxt = contxt;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
	
	
	
	
	
	
	
}