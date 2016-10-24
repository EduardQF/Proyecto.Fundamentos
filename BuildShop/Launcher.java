package buildshop;

public class Launcher {
	public static void main(String[] args) throws InterruptedException {
		start();
	}
	
	private static void start() throws InterruptedException{
		DataManager.showLS();
		System.out.println("LS Loaded");
		Thread.sleep(500);
		DataManager.readDB();
		System.out.println("DB Loaded");
		LogIn li = new LogIn();
		li.setVisible(true);
	}

}
