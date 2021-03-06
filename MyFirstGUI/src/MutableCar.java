import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MutableCar extends Vehicle {
static long count = 0;
	
	private double xPos;
	private double yPos;
	
		
	
	public MutableCar(double xPos,double yPos, Color carColor, int speed, int direction){
		super(xPos, yPos, carColor, speed, direction);
	}
	public MutableCar(double xPos,double yPos, Color carColor){
		super(xPos, yPos, carColor);
	}
	
	
	public void setPosition(double xPos, double yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	public void draw(Graphics g, Color newColor){
		
		Point2D.Double rearWindowStart = new Point2D.Double(this.getxPos()+10,this.getyPos()+10);
		Point2D.Double rearWindowEnd = new Point2D.Double(this.getxPos()+20,this.getyPos()+0);
		Line2D.Double rearWindow = new Line2D.Double(rearWindowStart, rearWindowEnd);
		
		Point2D.Double roofStart = new Point2D.Double(this.getxPos()+20,this.getyPos()+0);
		Point2D.Double roofEnd = new Point2D.Double(this.getxPos()+40,this.getyPos()+0);
		Line2D.Double roof = new Line2D.Double(roofStart, roofEnd);
		
		Point2D.Double frontWindowStart = new Point2D.Double(this.getxPos()+40,this.getyPos()+0);
		Point2D.Double frontWindowEnd = new Point2D.Double(this.getxPos()+50,this.getyPos()+10);
		Line2D.Double frontWindow = new Line2D.Double(frontWindowStart, frontWindowEnd);
		
		Rectangle2D.Double body = new Rectangle2D.Double(this.getxPos()+0,this.getyPos()+10, 60, 10);
		
		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.getxPos()+10, this.getyPos()+20, 10, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getxPos()+40, this.getyPos()+20, 10, 10);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.draw(rearTire);
		g2.draw(frontTire);
		g2.setColor(newColor);
		g2.fill(body);
		
	}
}
