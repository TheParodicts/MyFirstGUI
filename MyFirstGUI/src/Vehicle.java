import java.awt.Color;
import java.awt.Graphics;

public class Vehicle {
	private double xPos;
	private double yPos;
	private Color carColor;
	
	private int carSpeed;
	private int carDirection;
	
	private int carSpeedY;
	private int carDirectionY;
	
	public Vehicle(double xPos,double yPos, Color carColor, int speed, int direction){
		this.xPos = xPos;
		this.yPos = yPos;
		this.carColor = carColor;
		this.carDirection = direction;
		this.carSpeed = speed;
		this.carDirectionY = 1;
		this.carSpeedY = 40;
	}
	public Vehicle(double xPos,double yPos, Color carColor){
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

	public void draw (Graphics g, Color newColor){}
	
	public void move(int deltax, int deltay){
		this.xPos = xPos + deltax;
		this.yPos = yPos + deltay;
		
	}
}
