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
		//分割视频数据 和音频数据
		String[] tmp = data.split(",");
		dataVideo = tmp[0];
		dataSound = tmp[1];
		//通知中介者
		mediator.changed(this);
	}
	

}
