import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Turtle implements Raceable{
	private double xPos;
	private double yPos;
	private Color carColor;
	
	private int carSpeed;
	private int carDirection;
	
	private int carSpeedY;
	private int carDirectionY;
	
	private Image image;
	
	public Turtle(double xPos,double yPos, Color carColor, int speed, int direction){
		this.xPos = xPos;
		this.yPos = yPos;
		this.carColor = carColor;
		this.carDirection = direction;
		this.carSpeed = speed;
		this.carDirectionY = 1;
		this.carSpeedY = 40;
		
		File turtleFile = new File ("C:/Users/brian/git/MyFirstGUI/MyFirstGUI/src/photo/turtle.png");// cant fidn the image. make todo
		
		try{
			image = ImageIO.read(turtleFile);
		}
		catch(IOException e){
			System.out.println("Image File not found");
			System.exit(1);//Kill APP
		}
	}
	public Turtle(double xPos,double yPos, Color carColor){
		this.xPos = xPos;
		this.yPos = yPos;
		this.carColor = carColor;
		this.carDirection = 1;
		this.carSpeed = 10;
		this.carDirectionY = 1;
		this.carSpeedY = 40;
	}
	
	public double getxPos() {
		return xPos;
	}
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}
	public double getyPos() {
		return yPos;
	}
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	public Color getColor() {
		return carColor;
	}
	public void setColor(Color carColor) {
		this.carColor = carColor;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	public int getCarDirection() {
		return carDirection;
	}
	public void setCarDirection(int carDirection) {
		this.carDirection = carDirection;
	}
	public int getCarSpeedY() {
		return carSpeedY;
	}
	public void setCarSpeedY(int carSpeedY) {
		this.carSpeedY = carSpeedY;
	}
	public int getCarDirectionY() {
		return carDirectionY;
	}
	public void setCarDirectionY(int carDirectionY) {
		this.carDirectionY = carDirectionY;
	}

	public void draw (Graphics g, Color newColor){

		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(this.image, (int)Math.round(this.getxPos()), (int)Math.round(this.getyPos()), null);//fix to print picture.

		
	}
	
	public void move(int deltax, int deltay){
		this.xPos = xPos + deltax;
		this.yPos = yPos + deltay;
		
	}
}
