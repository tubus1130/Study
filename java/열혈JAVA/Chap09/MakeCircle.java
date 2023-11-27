public class MakeCircle {
    public static void main(String[] args) {
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}
}

class Point{
	int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle{
	int r;
	Point p;

	public Circle(int x, int y, int r) {
		p = new Point(x,y);
		this.r = r;
	}

	public void showCircleInfo() {
		p.showPointInfo();
		System.out.println("반지름 : " + r);
	}
	
}
