package interfaceSample;

class Phone{
	
	void call() {
		System.out.println("Call function in mobile");
	}
	void sms() {
		System.out.println("Sms Service in mobile");
	}
}

interface Camera{
	public void click();
	public void video();
}
interface MusicPlayer{
	public void play();
	public void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
	
	public void videoCall() {
		System.out.println("Video call Feature");
	}
	public void click() {
		System.out.println("Camera click through option");
	}
	public void video() {
			System.out.println("Camera video enabled option");
		}
	public void play() {
		System.out.println("Play option");
	}
	public void stop() {
		System.out.println("Stop option");
	}
	
}
public class InterfaceExample {
	public static void main(String args[]) {
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.sms();
		sp.play();
		sp.stop();
		sp.video();
		sp.videoCall();
	}

}
