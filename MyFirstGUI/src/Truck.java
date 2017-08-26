import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Truck extends Vehicle{

	public Truck(double xPos,double yPos, Color carColor, int speed, int direction){
		super(xPos, yPos, carColor, speed+10, direction);
	}
	public Truck(double xPos,double yPos, Color carColor){
		super(xPos, yPos, carColor);
	}
	
public void draw(Graphics g, Color newColor){
		
		
		
		Rectangle2D.Double cargo = new Rectangle2D.Double(this.getxPos()+0,this.getyPos()+0, 50, 20);
		Rectangle2D.Double body = new Rectangle2D.Double(this.getxPos()+50,this.getyPos()+9, 10, 10);
		Ellipse2D.Double rearTire1 = new Ellipse2D.Double(this.getxPos()+0, this.getyPos()+20, 10, 10);
		Ellipse2D.Double rearTire2 = new Ellipse2D.Double(this.getxPos()+10, this.getyPos()+20, 10, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getxPos()+40, this.getyPos()+20, 10, 10);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.draw(rearTire1);
		g2.draw(rearTire2);
		g2.draw(frontTire);
		g2.setColor(newColor);
		g2.fill(cargo);
		g2.fill(body);
		
	}
}
