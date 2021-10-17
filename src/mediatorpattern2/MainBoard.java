package mediatorpattern2;

public class MainBoard extends Mediator{
	//声明设备变量
	private CdDevice cdDevice;
	private CPU cpu;
	private SoundCard soundCard;
	private GraphicsCard graphicsCard;
	
	
	@Override
	public void changed(Colleague c) {
		if (c == cpu) {
			handleCPU((CPU) c);
		}else if(c == cdDevice){
			handleCDDevice((CdDevice) c);
		}
	}


	private void handleCDDevice(CdDevice c) {
		cpu.decodeData(c.read());
	}


	private void handleCPU(CPU c) {
		soundCard.palySound(c.getDataSound());
		graphicsCard.palyVideo(c.getDataVideo());
	}

	public void setCdDevice(CdDevice cdDevice) {
		this.cdDevice = cdDevice;
	}


	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}


	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	
}
