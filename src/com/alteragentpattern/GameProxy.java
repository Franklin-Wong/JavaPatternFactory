package com.alteragentpattern;

public class GameProxy implements IGamePalyer{

	private IGamePalyer gamePalyer = null;

	public GameProxy(IGamePalyer gamePlayer) {
		this.gamePalyer = gamePalyer;
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

	@Override
	public IGamePalyer getProxy() {
		return this;
	}

	
}
