package com.abstractfactory;

public class MaleFactory implements HumanFactory{

	@Override
	public Human createYellowHuaman() {
		return new MaleYellowMan();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteMan();
	}

}
