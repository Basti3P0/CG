package Pong;

public class HitBox {

	double minX;
	double maxX;
	double minY;
	double maxY;

	public HitBox(double minX, double maxX, double minY, double maxY) {
		this.minX = minX;
		this.maxX = maxX;
		this.minX = minY;
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

	boolean istIn(double x, double y) {
		if (x >= minX & x <= maxX & y >= minY & y <= maxY) {
			return true;
		}
		return false;
	}

	// |
	boolean hit(HitBox box) {
		if (istIn(box.getMinX(), box.getMinY()) | istIn(box.getMaxX(), box.getMaxY())
				| istIn(box.getMaxX(), box.getMinY()) | istIn(box.getMinX(), box.getMaxY())) {
			return true;
		}
		return false;
	}

}
