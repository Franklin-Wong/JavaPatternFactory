package mediatorpattern2;

public class CdDevice extends Colleague{

	private String data;
	public CdDevice(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public String read(){
		return data;
	}
	public void load(){
		data = "��Ƶ����,��Ƶ����";
		//֪ͨ�н���
		mediator.changed(this);
	}
}
