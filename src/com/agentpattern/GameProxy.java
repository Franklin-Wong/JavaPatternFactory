package com.agentpattern;

public class GameProxy implements IGamePalyer{

	private IGamePalyer gamePalyer = null;

	public GameProxy(GamePlayer gamePlayer) {
		this.gamePalyer = gamePalyer;
	}

	public GameProxy(String name) {

	}

	@Override
	public void login(String name, String password) {

		this.gamePalyer.login(name, password);
	}

	@Override
	public void killboss() {

		this.gamePalyer.killboss();
	}

	@Override
	public void upgrade() {
		this.gamePalyer.upgrade();		
	}


	
}
