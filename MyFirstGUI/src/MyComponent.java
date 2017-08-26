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
	
	private static Raceable theCars[];
	private static	Random genRand = new Random();
	public static final int laneWidth = 50;
	
	private static boolean someCarWon =false;
	public boolean getSomeCarWon(){return someCarWon;}
	
	public MyComponent(int numCars){
		theCars = new Raceable[numCars];
		for(int i = 0; i<numCars; i++){
			int laneY = i * laneWidth +10;
			if (i==0){
				theCars[i] = new PoliceCar(0, laneY, Color.BLUE, 0, 1);
			}
			else if (i==1){
				theCars[i]= new Truck(0, laneY, Color.MAGENTA, 0, 1);}
			else if (i==2){
				theCars[i]= new Turtle (0, laneY, Color.MAGENTA, 0, 1);
			}
			else {theCars[i]= new MutableCar(0, laneY, Color.RED, 0, 1 );}
		}
	}
	public boolean carCrashed(Raceable c){
		return (((c.getCarDirection() >0) && (c.getxPos()+60 >= this.getWidth()))
				|| 
				(c.getCarDirection() <=0 && c.getxPos() <= 0));
	}

	public boolean carReachedTopOrBottom(Raceable c){
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
			if (theCars[iMax].getxPos() < theCars[i].getxPos())
			{
				iMax = i;
			}
		}
		for (int i = 0; i< theCars.length;i++ ){
			if (i!=iMax){
				theCars[i].draw(g,theCars[i].getColor());
			}
		else{
			theCars[i].draw(g, Color.GREEN);
			}
		theCars[i].move(genRand.nextInt(10), 0);
		if(this.carCrashed(theCars[i])){
		someCarWon = true;
		
		}
		
		System.out.println("Painted " + counter++ + " times.");
	}

	}
	
}
