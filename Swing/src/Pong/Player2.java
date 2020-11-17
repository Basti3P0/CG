package Pong;

public class Player2 {
	
	public double x, y;

	public Player2(double x, double y) {
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
			case "p":
				if (y>6)
				y-=3;
				break;
			case "l":
				if (y<=650)
				y+=3;
				break;
			}
		}
	}

}
