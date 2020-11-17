package Pong;

import java.awt.event.ActionListener;

public class Player {

//	double minX;
//	double maxX;
//	double minY;
//	double maxY;
//
//	public Player(double minX, double maxX, double minY, double maxY) {
//		this.minX=minX;
//		this.maxX=maxX;
//		this.minY=minY;
//		this.maxY=minY;
//	}
	
	public double x, y;

	public Player(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	public void update() {
		for (String x : UserInput.list) {
			switch (x) {
			case "w":
				if (y>6)
				y-=3;
				break;
			case "s":
				if (y<=650)
				y+=3;
				break;
			}
		}
	}
	

	
	

}
