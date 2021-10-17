package com.alteragentpattern;

public class Client {

	public static void main(String[] args) {
		IGamePalyer gamePlayer = new GamePlayer("���");
		IGamePalyer proxy = gamePlayer.getProxy();
		proxy.login("���", "pwd");
		
		
		proxy.killboss();
		
		proxy.upgrade();
		
	}
}
