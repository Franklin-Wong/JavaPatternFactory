package com.alteragentpattern;

public interface IGamePalyer {

	public  void login(String name,String password);
	public  void killboss();
	public  void upgrade();
	public IGamePalyer getProxy();

	
}
