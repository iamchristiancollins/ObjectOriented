package hw2wClasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JComponent;

public class SquareComponent extends JComponent {
	Random r = new Random();
	private int xcoord;
	private int ycoord;
	private int width;
	private int height;
	
	private int red;
	private int green;
	private int blue;
	private Color color = new Color (red, green, blue);
	
	private Rectangle sq = new Rectangle(xcoord,ycoord,width,height);
	
	//constructor
	public SquareComponent (int x, int y, int h) {
		this.xcoord = x;
		this.ycoord = y;
		this.width = h;
		this.height = h;
	}
	
	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
		g2.draw(this.sq);
		g2.setColor(this.color);	
		g2.fill(this.sq);

	} 

	public void setSquare(Color color) {
		this.color = color;
		this.sq = new Rectangle (xcoord,ycoord,width,height);
	}

}
