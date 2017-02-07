import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	static int counter = 0;
	
	public void paintComponent(Graphics g) {
		
	Car c = new Car(0,0, Color.RED);
	Car c2 = new Car(0,40,Color.BLUE);
	c.draw(g);
	c2.draw(g);
		
		//Rectangle r2 = new Rectangle(this.getWidth()-50,this.getHeight()-50,50,50);
			//	g2.draw(r2);
		System.out.println("Painted " + counter++ + " times.");
	}

}
