package hw2wClasses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class ShapeViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(900,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		
		int x = r.nextInt(301); //exclusive
		int y = r.nextInt(301);
		int h = r.nextInt(301);
		
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		Color color = new Color (red, green, blue);
		
		RectangleComponent n = new RectangleComponent(x,y,h);
		n.setRectangle(color);
		SquareComponent n2 = new SquareComponent(x,y,h);
		n2.setSquare(color);
		
		frame.add(n);
		frame.add(n2);
		
		frame.setVisible(true);

	}

}
