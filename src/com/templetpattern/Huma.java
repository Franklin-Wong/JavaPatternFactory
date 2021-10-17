package com.templetpattern;

public class Huma extends AbstractModel{

	private boolean alarmFlag = false;
	@Override
	public void start() {
		System.out.println("huma start");
		
	}

	@Override
	public void stop() {
		System.out.println("huma stop");
		
	}

	@Override
	public void alarm() {
		System.out.println("huma alarm");
		
	}

	@Override
	public void engineBoom() {
		System.out.println("huma engineBoom");
		
	}
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag ;
	}

	//客户可以决定是否开喇叭
	protected void setAlarm(boolean flag) {
		this.alarmFlag = flag;
	}
}
