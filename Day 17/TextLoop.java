package day17;


public class TextLoop implements Runnable {
	public static final int COUNT = 10;
	private final String name;
	public TextLoop(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		sinc();
	}
	
	public void sinc(){
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}
	
	public static void main(String args[]) {
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				System.out.println("hello");
				Runnable r = new TextLoop("Thread " + i);
				r.run();
			}
		} else {
			callf();
		}
	}
	
	public static void callf() {
			for (int i = 0; i < 10; i++) {		
				Runnable r = new TextLoop("Thread " + i);
				Thread t = new Thread(r);
				t.start();
			}
	}
}

