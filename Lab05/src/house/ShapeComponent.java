package house;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serial;
import java.util.Random;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent {

	public void paintComponent(Graphics g) {
		// Casts g as a Graphics2D object, allows us to draw/fill with shape objects
		Graphics2D g2 = (Graphics2D) g;

		Random randy = new Random();


		Rectangle2D.Double home = new Rectangle2D.Double(350, 400, 500, 300);
		Rectangle2D.Double door = new Rectangle2D.Double(400, 600, 50, 100);
		Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, 1200, 700);
		Rectangle2D.Double grass = new Rectangle2D.Double(0, 700, 1200, 200);
		Ellipse2D.Double doorKnob = new Ellipse2D.Double(440, 652, 5, 5);
		Ellipse2D.Double sun = new Ellipse2D.Double(150, 150, 100, 100);


		g2.setColor(new Color(153, 204, 255));
		g2.fill(sky);
		g2.setColor(Color.YELLOW);
		g2.fill(sun);
		createCloud(g2, randy.nextInt(100, 1000), randy.nextInt(50, 500));
		createCloud(g2, randy.nextInt(100, 1000), randy.nextInt(50, 500));
		createCloud(g2, randy.nextInt(100, 1000), randy.nextInt(50, 500));
		g2.setColor(new Color(3, 96, 20));
		g2.fill(grass);
		g2.setColor(new Color(167, 168, 162));
		g2.fill(home);
		g2.setColor(new Color(68, 54, 68));
		g2.fill(door);
		g2.setColor(Color.BLACK);
		g2.fill(doorKnob);
		createWindow(g2, 400, 450);
		createWindow(g2, 600, 450);
		createWindow(g2, 600, 550);
		createWindow(g2, 750, 550);
		createWindow(g2, 750, 450);
		createTree(g2, 200);
		createTree(g2, 850);

		int[] xPoints = { 350, 600, 850 };
		int[] yPoints = { 400, 200, 400 };
		Polygon roof = new Polygon(xPoints, yPoints, 3);
		g2.setColor(new Color(7, 14, 57));
		g2.fill(roof);


		Font textFont = new Font("Helvetica", Font.BOLD, 16);
		g2.setFont(textFont);
		g2.drawString("Christian Collins", 1050, 825);

	}

	public void createWindow(Graphics2D g2, int x, int y) {
		Rectangle2D.Double window1 = new Rectangle2D.Double(x, y, 50, 50);
		g2.setColor(Color.WHITE);
		g2.fill(window1);
		g2.setColor(Color.BLACK);
		g2.drawLine(x+25, y, x+25, y+50);
		g2.drawLine(x, y+25, x+50, y+25);

	}

	public void createCloud(Graphics2D g2, int x, int y){
		Ellipse2D.Double cloud1 = new Ellipse2D.Double(x+25, y, 100, 65);
		Ellipse2D.Double cloud2 = new Ellipse2D.Double(x, y-25, 100, 65);
		Ellipse2D.Double cloud3 = new Ellipse2D.Double(x-25, y, 100, 65);


		g2.setColor(Color.WHITE);
		g2.fill(cloud1);
		g2.fill(cloud2);
		g2.fill(cloud3);

	}

	public void createTree(Graphics2D g2, int x) {
		Rectangle2D.Double tree = new Rectangle2D.Double(x, 500, 50, 200);
		g2.setColor(new Color(171, 97, 52));
		g2.fill(tree);
		g2.setColor(new Color(3, 96, 20));
		for (int i = 0; i < 6; i++){
			int[] xPoints = { x-50, x+25, x+100 };
			int[] yPoints = { 650-(25*i), 550-(25*i), 650-(25*i) };
			Polygon treeGreens = new Polygon(xPoints, yPoints, 3);
			g2.fill(treeGreens);

		}
	}







	@Serial
	private static final long serialVersionUID = 1L;

}
