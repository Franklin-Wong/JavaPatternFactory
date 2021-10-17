package com.templetpattern;

public abstract class CarModel {
	/*
	* ���ȣ� ���ģ��Ҫ�ܷ��������� �������ҡ������ ���ǵ��������� ����
	* ��Ҫ�ܹ����������� �����ʵ��Ҫ��ʵ��������
	*/
	protected abstract void start();
	//�ܷ����� ��Ҫ��ͣ������ �ǲ����汾��
	protected abstract void stop();
	//���Ȼ�������� �ǵενУ� �������ٽ�
	protected abstract void alarm();
	//������¡¡���죬 �������Ǽٵ�
	protected abstract void engineBoom();
	//��ģ��Ӧ�û��ܰɣ� ��������Ƶģ� ���ǵ��������� ��֮Ҫ����
	public void templateMethod(){
	//�ȷ�������
	this.start();
	//���濪ʼ����
	this.engineBoom();
	//Ȼ��Ϳ�ʼ���ˣ� �ܵĹ���������һ������·�� �Ͱ�����
	if (isAlarm()) {
		this.alarm();

	}
	//����Ŀ�ĵؾ�ͣ��
	this.stop();
	}
	protected boolean isAlarm() {
		return true;
	}
	
}
