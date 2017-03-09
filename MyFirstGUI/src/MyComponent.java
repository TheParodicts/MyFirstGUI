import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static int counter = 0;
	
	private static MutableCar theCars[];
	private static	Random genRand = new Random();
	public static final int laneWidth = 40;
	
	private static boolean someCarWon =false;
	public boolean getSomeCarWon(){return someCarWon;}
	
	public MyComponent(int numCars){
		theCars = new MutableCar[numCars];
		for(int i = 0; i<numCars; i++){
			int laneY = i * laneWidth;
			theCars[i]= new MutableCar(0, laneY, Color.RED, 0, 1 );
		}
	}
	public boolean carCrashed(MutableCar c){
		return (((c.getCarDirection() >0) && (c.getxPos()+60 >= this.getWidth()))
				|| 
				(c.getCarDirection() <=0 && c.getxPos() <= 0));
	}

	public boolean carReachedTopOrBottom(MutableCar c){
		if (c.getCarDirectionY() > 0){
			return(c.getyPos()+30 >= this.getHeight()-40);
		}
		else{
			return (c.getyPos()<=0);
		}
	}
	
	public void paintComponent(Graphics g) {
		int iMax = 0;
for (int i = 0; i< theCars.length;i++ ){
			
	theCars[i].draw(g);
	theCars[i].move(genRand.nextInt(10), 0);
	theCars[i].setColor(Color.RED);
	
	if (theCars[iMax].getxPos() < theCars[i].getxPos()){
		iMax = i;
	}
	if(this.carCrashed(theCars[i])){
		someCarWon = true;
		//if (this.carReachedTopOrBottom(theCar)){
		//	theCar.setCarDirectionY(theCar.getCarDirectionY()*-1);
		}
		//int deltax = theCar.getCarDirection()*theCar.getCarSpeed();
	//int deltay = theCar.getCarDirectionY()*theCar.getCarSpeedY();
	
		//theCar.move(deltax, deltay);
	//}}
	/*theCar.setPosition(0, 0);
	theCar.draw(g);
	
	theCar.setPosition(0, 40);*/
	
		
		//Rectangle r2 = new Rectangle(this.getWidth()-50,this.getHeight()-50,50,50);
			//	g2.draw(r2);
		System.out.println("Painted " + counter++ + " times.");
	}
theCars[iMax].setColor(Color.GREEN);
}}
