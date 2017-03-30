import javax.swing.JFrame;

public class Main {
	public static void main (String[] args) throws InterruptedException {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400, 700);
		mainFrame.setTitle("My First Java GUI with mutable cars Rocks!!");
		
		int numCars = mainFrame.getHeight()/MyComponent.laneWidth-1;
		MyComponent theComponent = new MyComponent(numCars);
		mainFrame.add(theComponent);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(!theComponent.getSomeCarWon()){
			mainFrame.repaint();
			Thread.sleep(100);
		}
	}
}
