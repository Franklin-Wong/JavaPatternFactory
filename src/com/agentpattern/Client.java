package com.agentpattern;

public class Client {

	public static void main(String[] args) {
		IGamePalyer gamePlayer = new GamePlayer("���");
		IGamePalyer proxy = new GameProxy("");
		System.out.println("��ҵ�½--------");
		proxy.login("Name", "Pwd");
		
		System.out.println("���--");
		proxy.killboss();
		
		
		
	}
}
