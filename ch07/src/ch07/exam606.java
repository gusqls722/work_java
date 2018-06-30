package ch07;
class MyPoint{
	int x;
	int y;
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		double Xdiff = x1-x;
		double Ydiff = y1-y;
		double length = -1;
		length = Math.sqrt(Xdiff * Xdiff + Ydiff * Ydiff);
		if(length <0) {
			length *= -1;
		}
		return length;
	}
}
class exam606{
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와 (2, 2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}
}