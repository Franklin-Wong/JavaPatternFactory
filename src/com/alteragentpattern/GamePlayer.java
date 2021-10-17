package com.alteragentpattern;

public class GamePlayer implements IGamePalyer{

	private String name = "";
	//ָ���ҵĴ������
	private IGamePalyer gameProxy = null;
	
	@Override
	public IGamePalyer getProxy() {
		gameProxy = new GameProxy(this);
		return gameProxy;
	}

	public GamePlayer(String name) {
		this.name = name;
	}
	@Override
	public void login(String name, String password) {
		this.name = name;
		System.out.println("����:"+name+"-------------"+"����:"+password);
	}
	@Override
	public void killboss() {
		System.out.println(this.name+"-------------���");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name+"-------------����");
	}


}
