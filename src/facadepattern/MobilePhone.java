package facadepattern;

public class MobilePhone {

	private Phone phone = new PhoneImpl();
	private Camera camera = new MICamera();
	
	public void call(){
		phone.dail();
	}
	public void hang(){
		phone.hang();
	}
	public void takePhoto(){
		camera.open();
		camera.takePhoto();
	}
	public void chat(){
		camera.open();
		camera.takePhoto();
		phone.dail();
	}
	
}
