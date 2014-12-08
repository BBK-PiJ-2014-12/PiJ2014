public class ProtectedSmartPhone extends MobilePhone {
	public void browseWeb(String msg) {
		System.out.println("Browser " + msg);
	}
	public Position findPosition() {
		Position p = new Position(23, 43);
		return p;
	}
	public ProtectedSmartPhone(String brand) {
		super(brand);
	}
	@Override
	public void call(String number) {
		if(number.charAt(0) == '0' && number.charAt(1) == '0') {
			System.out.println("International blabla... " + number);
		}else{
			super.call(number);
		}
	}
	
	@Override
	public void playGame(String msg) {
		System.out.println("Play Game when allowed" + msg);
	}
}