package Pong;

public class Dot {

//
	public double x, y;

	public double direction = 1;

	double up = 1;
	double down = -1;
	double ydirection = 1;

	public Dot(double x_, double y_) {
		x = x_;
		y = y_;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void update() {
		y = y + (0.3 * ydirection);
		x = x + (0.3 * direction);
	}

	public void collided(boolean col) {
		if (y >= 750)
			ydirection = down;
		if (y <= 15)
			ydirection = up;

		if (col == true & direction == 1) {
			direction = -1;
		} else if (col == true & direction == -1) {
			direction = 1;
		}
		if (x <= 0) {
			System.out.println("Punkt Spieler 2");
		}
		if(x>=1200) {
			System.out.println("Punkt Spieler 1");
		}
	}

//	double direction = 0.3;
//	double up = 0.3;
//	double down = -0.3;
//
//	// x += 0.1 Bewegung von 0.1 Pixel nach rechts
//	public void move() {
//
//		//x = x -0.1;
//		y += direction;
//		if (y >= 750)
//			direction = down;
//		if (y <= 15)
//			direction = up;
//		
//		
//	}
//
//	public void update() {
//
//		if (x >= 500 | x <= 0) {
//			x = -(x + 1);
//		}
//		x += 0.3;

}
