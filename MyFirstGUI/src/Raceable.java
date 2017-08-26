import java.awt.Color;
	import java.awt.Graphics;
public interface Raceable {
		
		public double getxPos();
		public void setxPos(double xPos);
		public double getyPos();
		public void setyPos(double yPos);
		public Color getColor() ;
		public void setColor(Color carColor);
		public int getCarSpeed() ;
		public void setCarSpeed(int carSpeed) ;
		public int getCarDirection() ;
		public void setCarDirection(int carDirection) ;
		public int getCarSpeedY() ;
		public void setCarSpeedY(int carSpeedY) ;
		public int getCarDirectionY();
		public void setCarDirectionY(int carDirectionY) ;
		public void move(int deltax, int deltay);
		
		public void draw (Graphics g, Color newColor);
		
		
	

}
