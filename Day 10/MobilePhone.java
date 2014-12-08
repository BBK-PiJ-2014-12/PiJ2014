public class MobilePhone extends OldPhone {
	public void ringAlarm(String msg) {
		System.out.println("Ring Alarm " + msg);
	}
	protected void playGame(String msg) {
		System.out.println("Play Game " + msg);
	}
	public MobilePhone(String brand) {
		super(brand);
	}
	
	private String[] numbers = new String[10];
	
	public void printLastNumbers() {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}