package mediatorpattern2;

public class CPU extends Colleague{

	private String dataVideo, dataSound;
	public CPU(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	public String getDataVideo() {
		return dataVideo;
	}
	public String getDataSound() {
		return dataSound;
	}
	
	public void decodeData(String data){
		//�ָ���Ƶ���� ����Ƶ����
		String[] tmp = data.split(",");
		dataVideo = tmp[0];
		dataSound = tmp[1];
		//֪ͨ�н���
		mediator.changed(this);
	}
	

}
