package Pong;

public class Collider {

	double minX;
	double maxX;
	double minY;
	double maxY;

	public Collider(double minX, double minY) {
		this.minX = minX;
		maxX = minX + 20;
		this.minX = minY;
		maxY = minY + 200;
	}

	public Collider(double minX, double maxX, double minY, double maxY) {
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}

	public double getMaxX() {
		return maxX;
	}

	public double getMinX() {
		return minX;
	}

	public double getMaxY() {
		return maxY;
	}

	public double getMinY() {
		return minY;
	}

	public void updateCube(Cube cube) {
		minX = cube.getX();
		minY = cube.getY();
		maxX = minX + 20;
		maxY = minY + 200;
	}

	public void updatePlayer(Player player) {
		minX = player.getX();
		minY = player.getY();
		maxX = minX + 20;
		maxY = minY + 200;
	}

	public void updatePlayer2(Player2 player) {
		minX = player.getX();
		minY = player.getY();
		maxX = minX + 20;
		maxY = minY + 200;
	}

	public void updateDot(Dot dot) {
		minX = dot.getX();
		minY = dot.getY();
		maxX = minX + 20;
		maxY = minY + 20;
	}

	boolean istIn(double x, double y) {
		if (x >= minX & x <= maxX & y >= minY & y <= maxY) {
			return true;
		}
		return false;
	}

	boolean hit(Collider box) {
		if (istIn(box.getMinX(), box.getMinY()) | istIn(box.getMaxX(), box.getMaxY())
				| istIn(box.getMaxX(), box.getMinY()) | istIn(box.getMinX(), box.getMaxY())) {
			//Cube.speed = true;
			System.out.println("abgeprallt");
			return true;
		}
		return false;
	}

}
