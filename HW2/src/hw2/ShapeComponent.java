package hw2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.*;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent {

	public void paintComponent(Graphics g) {
		// Casts g as a Graphics2D object, allows us to draw/fill with shape objects
		Graphics2D g2 = (Graphics2D) g;

		g2.drawLine(0, 425, 1200, 425);
		g2.drawLine(600, 0, 600, 850);


		int counter = 0;
		while (counter < 4) {
			int shape = ThreadLocalRandom.current().nextInt(0, 4);
			if (shape == 0) {
				randRecGenerator(g2, counter);
			} else if (shape == 1) {
				randTriGenerator(g2, counter);
			} else if (shape == 2) {
				randSqGenerator(g2, counter);
			} else if (shape == 3) {
				randCirGenerator(g2, counter);
			}
			counter++;

		}


		

	}

	public void randRecGenerator(Graphics2D g2, int quad) {
		int recLen = ThreadLocalRandom.current().nextInt(25, 101);
		int recX = 0;
		int recY = 0;
		if (quad == 0) {
			recX = ThreadLocalRandom.current().nextInt(0, 474);
			recY = ThreadLocalRandom.current().nextInt(1, 224);
		} else if (quad == 1) {
			recX = ThreadLocalRandom.current().nextInt(601, 1000);
			recY = ThreadLocalRandom.current().nextInt(1, 224);
		} else if (quad == 2) {
			recX = ThreadLocalRandom.current().nextInt(0, 474);
			recY = ThreadLocalRandom.current().nextInt(426, 625);
		} else {
			recX = ThreadLocalRandom.current().nextInt(601, 1099);
			recY = ThreadLocalRandom.current().nextInt(426, 625);
		}
		Rectangle2D.Double r = new Rectangle2D.Double(recX, recY, recLen, 2 * recLen);
		g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256),
				ThreadLocalRandom.current().nextInt(256)));
		g2.fill(r);

	}

	public void randTriGenerator(Graphics2D g2, int quad) {
		int len = ThreadLocalRandom.current().nextInt(25, 101);
		if (quad == 0) {
			int triX = ThreadLocalRandom.current().nextInt(1, 500);
			int triY = ThreadLocalRandom.current().nextInt(1, 324);
			int[] xPoints = { triX, triX + len / 2, triX + len };
			int[] yPoints = { triY + len, triY, triY + len };
			Polygon tri = new Polygon(xPoints, yPoints, 3);
			g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256),
					ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(256)));
			g2.fillPolygon(tri);
		} else if (quad == 1) {
			int triX = ThreadLocalRandom.current().nextInt(602, 1099);
			;
			int triY = ThreadLocalRandom.current().nextInt(1, 324);
			;
			int[] xPoints = { triX, triX + len / 2, triX + len };
			int[] yPoints = { triY + len, triY, triY + len };
			Polygon tri = new Polygon(xPoints, yPoints, 3);
			g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256),
					ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(256)));
			g2.fillPolygon(tri);
		} else if (quad == 2) {
			int triX = ThreadLocalRandom.current().nextInt(1, 500);
			;
			int triY = ThreadLocalRandom.current().nextInt(426, 745);
			;
			int[] xPoints = { triX, triX + len / 2, triX + len };
			int[] yPoints = { triY + len, triY, triY + len };
			Polygon tri = new Polygon(xPoints, yPoints, 3);
			g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256),
					ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(256)));
			g2.fillPolygon(tri);
		} else {
			int triX = ThreadLocalRandom.current().nextInt(602, 1099);
			;
			int triY = ThreadLocalRandom.current().nextInt(451, 745);
			;
			int[] xPoints = { triX, triX + len / 2, triX + len };
			int[] yPoints = { triY + len, triY, triY + len };
			Polygon tri = new Polygon(xPoints, yPoints, 3);
			g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256),
					ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(256)));
			g2.fillPolygon(tri);
		}
	}

	public void randSqGenerator(Graphics2D g2, int quad) {
		int sqLen = ThreadLocalRandom.current().nextInt(25, 101);
		int recX = 0;
		int recY = 0;
		if (quad == 0) {
			recX = ThreadLocalRandom.current().nextInt(0, 474);
			recY = ThreadLocalRandom.current().nextInt(1, 324);
		} else if (quad == 1) {
			recX = ThreadLocalRandom.current().nextInt(601, 1000);
			recY = ThreadLocalRandom.current().nextInt(1, 324);
		} else if (quad == 2) {
			recX = ThreadLocalRandom.current().nextInt(0, 474);
			recY = ThreadLocalRandom.current().nextInt(426, 725);
		} else {
			recX = ThreadLocalRandom.current().nextInt(601, 1099);
			recY = ThreadLocalRandom.current().nextInt(426, 725);
		}
		Rectangle2D.Double r = new Rectangle2D.Double(recX, recY, sqLen, sqLen);
		g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256),
				ThreadLocalRandom.current().nextInt(256)));
		g2.fill(r);
	}

	public void randCirGenerator(Graphics2D g2, int quad) {
		int rad = ThreadLocalRandom.current().nextInt(25, 101);
		int x = 0;
		int y = 0;
		if (quad == 0) {
			x = ThreadLocalRandom.current().nextInt(0, 499);
			y = ThreadLocalRandom.current().nextInt(1, 249);
		} else if (quad == 1) {
			x = ThreadLocalRandom.current().nextInt(601, 950);
			y = ThreadLocalRandom.current().nextInt(1, 249);
		} else if (quad == 2) {
			x = ThreadLocalRandom.current().nextInt(0, 499);
			y = ThreadLocalRandom.current().nextInt(426, 650);
		} else {
			x = ThreadLocalRandom.current().nextInt(601, 950);
			y = ThreadLocalRandom.current().nextInt(426, 650);
		}

		Ellipse2D.Double cir = new Ellipse2D.Double(x, y, rad, rad);
		g2.setColor(new Color(ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256),
				ThreadLocalRandom.current().nextInt(256)));
		g2.fill(cir);
	}

	private static final long serialVersionUID = 1L;

}
