package com.agentpattern;

public class Client {

	public static void main(String[] args) {
		IGamePalyer gamePlayer = new GamePlayer("Íæ¼Ò");
		IGamePalyer proxy = new GameProxy("");
		System.out.println("Íæ¼ÒµÇÂ½--------");
		proxy.login("Name", "Pwd");
		
		System.out.println("´ò¹Ö--");
		proxy.killboss();
		
		
		
	}
}
