package thread.basic;

public class ThreadByImplementsQuick {
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {					
					System.out.println("Hello "+i );
				}
			}
		});
		t.start();
	}
}
