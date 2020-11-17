package Pong;

public class Cube {

	public double xstart, ystart;
	
	public double x, y;
	public double direction = 1;

	double up = 1;
	double down = -1;
	double ydirection = 1;
	
	
	public Cube(double x, double y) {
		this.x = x;
		this.y = y;
		this.xstart=x;
		this.ystart=y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void update() {
		y = y + (0.3 * ydirection);
		x = x + (0.3 * direction ) ;
	}

	public void collided(boolean col) {
		if (y >= 750)
			ydirection = down;
		if (y <= 15)
			ydirection = up;

		if (col == true & direction >= 1) {
			direction = -1;
			//direction = direction -0.3;
			System.out.println(direction);
		} else if (col == true & direction <= -1) {
			direction = 1;
			direction = direction +0.3;
		}

		if (x <= 0) {
			System.out.println("Punkt Spieler 2");
			CircleWorld.counterp2++;
			x=xstart;
			y=ystart;
		}
		if (x >= 1200) {
			System.out.println("Punkt Spieler 1");
			CircleWorld.counterp1++;
			x=xstart;
			y=ystart;
		}

	}
//		y += direction;
//		if (y >= 780)
//			direction = down;
//		if (y <= 20)
//			direction = up;

}
