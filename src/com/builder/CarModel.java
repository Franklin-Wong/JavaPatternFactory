package com.builder;

import java.awt.List;
import java.util.ArrayList;

public abstract class CarModel {
	
	
	private ArrayList<String> sequenceList = new ArrayList<String>();
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
		
		for (int i = 0; i < sequenceList.size(); i++) {
			String casename = sequenceList.get(i);
			if (casename.equalsIgnoreCase("start")) {
				//�ȷ�������
				this.start();
			}else if (casename.equalsIgnoreCase("alarm")) {
				this.alarm();

			}else if (casename.equalsIgnoreCase("engineBoom")) {
				//���濪ʼ����
				this.engineBoom();
			}else if (casename.equalsIgnoreCase("stop")) {
				//���濪ʼ����
				this.stop();
			}
		}
	}
	final public void setSequence(ArrayList sequenceList) {
		this.sequenceList = sequenceList;
	}

	
}
