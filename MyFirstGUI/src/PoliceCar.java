import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class PoliceCar extends MutableCar {
	
	static boolean biomboRed = false;
	
	public PoliceCar(double xPos, double yPos, Color carColor, int speed, int direction){
		super(xPos, yPos, Color.BLUE, speed, direction);
	}
	
	public void draw(Graphics g, Color newColor){
		super.draw(g, newColor);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double siren = new Ellipse2D.Double(this.getxPos()+27, this.getyPos()-5, 5, 5);
		if (biomboRed)
			g2.setColor(Color.RED);
		else
			g2.setColor(Color.BLUE);
		biomboRed = !biomboRed;
		g2.fill(siren);
	}
}
