package com.abstractfactory;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuaman() {
		return new FmaleYellowMan();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteMan();
	}

}
