package Pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicSystem extends JPanel {
	private GraphicsConfiguration graphicsConf = GraphicsEnvironment.getLocalGraphicsEnvironment()
			.getDefaultScreenDevice().getDefaultConfiguration();
	private BufferedImage imageBuffer;
	private Graphics graphics;
	private static final Color COLOR_DOT = new Color(0, 0, 0);
	static final int RADIUS_DOT = 20;
	private static final Color  green = new Color(45,175,0);
	public GraphicSystem() {
		this.setSize(1200, 800);
		imageBuffer = graphicsConf.createCompatibleImage(this.getWidth(), this.getHeight());
		graphics = imageBuffer.getGraphics();
		
	}
	


	public void clear() {
		graphics.setColor(green);
		graphics.fillRect(0, 0, 1200, 800);
	}
	
	public void drawPlayer(Player player) {
		graphics.setColor(COLOR_DOT);
		graphics.fillRect((int) player.x, (int) player.y, 20, 100);
	}
	
	public void drawPlayer2(Player2 player) {
		graphics.setColor(COLOR_DOT);
		graphics.fillRect((int) player.x, (int) player.y, 20, 100);
	}
	
	public void drawCube(Cube cube) {
		graphics.setColor(COLOR_DOT);
		graphics.fillRect((int) cube.x, (int) cube.y, 20, 20);
	}
	
	public void drawCounter() {
		Font fontBig = new Font("Source Code Pro", 0, 50);
		graphics.setFont(fontBig);
		graphics.setColor(Color.YELLOW);
		graphics.drawString(CircleWorld.counterp1 + "  :  " + CircleWorld.counterp2 , 480, 100);
		
	}
	


	public void draw(Dot dot) {
	//	<	>
		// if dot y pos < 0 or y pos > 800 
//		 {
//			graphics.setColor(COLOR_DOT);
//			graphics.fillOval((int) (dot.x - RADIUS_DOT)*-1, (int) (dot.y - RADIUS_DOT), RADIUS_DOT * 2, RADIUS_DOT * 2);
//		}
//				
		graphics.setColor(COLOR_DOT);
		graphics.fillOval((int) dot.x - RADIUS_DOT, (int) dot.y - RADIUS_DOT, RADIUS_DOT * 2, RADIUS_DOT * 2);
		
	}
	public void redraw() {
		this.getGraphics().drawImage(imageBuffer, 0, 0, this);
	}
}
//@SuppressWarnings("serial")
//public class GraphicSystem extends JPanel {
//	private static final Color COLOR_DOT = new Color(96, 96, 255);
//	private static final int RADIUS_DOT = 20;
//
//	public GraphicSystem() {
//		this.setSize(1000, 800);
//	}
//
//	public void clear() {
//		Graphics gra = this.getGraphics();
//		gra.setColor(Color.LIGHT_GRAY);
//		gra.fillRect(0, 0, 1000, 800);
//	}
//	
//	// ab hier alle Objekte auf dem Bildschirm zeichnen
//
//	public void draw(Dot dot) {
//		Graphics gra = this.getGraphics();
//		gra.setColor(COLOR_DOT);
//		gra.fillOval((int) dot.x - RADIUS_DOT, (int) dot.y - RADIUS_DOT, RADIUS_DOT * 2, RADIUS_DOT * 2);
//	}
//
//	public void redraw() {
//	}
//}