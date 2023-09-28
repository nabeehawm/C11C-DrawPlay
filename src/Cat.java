import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		int x= catX;
		int y= catY;
		
		Graphics2D g4 = (Graphics2D) g;
		x=catX+40;
		y=catY+60;
		// Draw a ice cream cat head
		g4.setColor(Color.blue);
		g4.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		
		Graphics2D g2 = (Graphics2D) g;
		x=catX+20;
		y=catY+30;
		// Draw a ice cream cat head
		g2.setColor(Color.pink);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		
		Graphics2D g3 = (Graphics2D) g;
		x=catX;
		y=catY;
		// Draw the head
		g3.setColor(Color.yellow);
		g3.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the ears
		g3.setColor(Color.yellow);
		g3.fillOval(catX, catY-10, x/2, y);
		g3.fillOval(catX+70, catY-10, x/2, y);
		// Draw cherry and toppings for cat head
		g2.setColor(Color.RED);
		g2.fillOval(catX + 40,catY - 5, 15, 15);
		g2.setColor(Color.MAGENTA);
		g2.drawString("',,''', ',, '' ,' '' '", catX + 5, catY + 20);
		// Draw the eyes
		g3.setColor(Color.pink);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g3.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g3.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g3.setColor(Color.red);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g3.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		// Making text pink because pink
		g3.setColor(Color.PINK);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g3.drawString("Meow", catX, catY+HEAD_DIMENSION+50);	
		g3.drawString("PIINK FFFLLUFFY UNICORNS DANCIN' ON RAINBOWS.", catX, catY+HEAD_DIMENSION+80);	
		
	}
}
