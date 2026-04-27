package interfaceExample;

public class SmartPhone implements Music,Camera,Phone{

	
	@Override
	public void playMusic() {

		System.out.println("Smart phine music player is ON !!");
	}

	@Override
	public void takePhoto() {

		System.out.println("Smart phone has HD camera for taking pictures!!");
	}

	@Override
	public void call() {

		System.out.println("Smart phone's have great speaker quality !!");
	}
	
	
	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		sp1.takePhoto();

		Phone p1 = new SmartPhone();
		p1.takePhoto();

	}


}
