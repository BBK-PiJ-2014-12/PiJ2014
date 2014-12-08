public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		//SmartPhone sp = new SmartPhone();
		SmartPhone sp = new SmartPhone("Apple");
		
		sp.call("+36 30 859 4343");
		sp.call("00 36 30 859 4343");
		sp.ringAlarm("Go to work");
		sp.playGame("CS");
		sp.printLastNumbers();
		sp.browseWeb("google");
		System.out.println(sp.findPosition());
	}
}