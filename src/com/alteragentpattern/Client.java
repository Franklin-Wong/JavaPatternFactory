package com.alteragentpattern;

public class Client {

	public static void main(String[] args) {
		IGamePalyer gamePlayer = new GamePlayer("Íæ¼Ò");
		IGamePalyer proxy = gamePlayer.getProxy();
		proxy.login("Íæ¼Ò", "pwd");
		
		
		proxy.killboss();
		
		proxy.upgrade();
		
	}
}
