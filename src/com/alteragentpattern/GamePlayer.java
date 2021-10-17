package com.alteragentpattern;

public class GamePlayer implements IGamePalyer{

	private String name = "";
	//指定我的代理对象
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
		System.out.println("姓名:"+name+"-------------"+"密码:"+password);
	}
	@Override
	public void killboss() {
		System.out.println(this.name+"-------------打怪");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name+"-------------升级");
	}


}
