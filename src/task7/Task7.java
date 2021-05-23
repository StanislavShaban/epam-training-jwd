package task7;

import utilities.InputValidator;

public class Task7 {
	static void taskLogic() {
		Task7 task7Instance = new Task7();
		Point firstPoint;
		Point secondPoint;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		InputValidator input = new InputValidator();
		
		x1 = input.inputInteger("Enter point x1: ");
		y1 = input.inputInteger("Enter point y1: ");
		firstPoint = task7Instance.new Point(x1, y1);
		
		x2 = input.inputInteger("Enter point x2: ");
		y2 = input.inputInteger("Enter point y2: ");
		secondPoint = task7Instance.new Point(x2, y2);
		
		System.out.println(firstPoint.getNearestPoint(secondPoint));
		
	}
	
	class Point {
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void setPointX(int x) {
			this.x = x;
		}
		
		public int getPointX() {
			return this.x;
		}
		
		public void setPointY(int y) {
			this.y = y;
		}
		
		public int getPointY() {
			return this.y;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj == this) {
				return true;
			} else if(!(obj instanceof Point)) {
				return false;
			} else {
				Point that = (Point)obj;
				if(this.x != that.x && this.y != that.y) {
					return false;
				}
				return true;
			}
		}
		
		@Override
		public String toString() {
			return "x: " + x + ", y: " + y;
		}
		
		@Override 
		public int hashCode() {
			int result = 31 * x;
			result = 31 * result * y;		
			return result;
		}
		
		public double getDistanceToThePoint() {
			return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		}
		
		public Point getNearestPoint(Point secondPoint) {
			double firstPointDistance = this.getDistanceToThePoint();
			double secondPointDistance = secondPoint.getDistanceToThePoint();
			
			if(firstPointDistance > secondPointDistance) {
				return this;
			} else if(firstPointDistance < secondPointDistance) {
				return secondPoint;
			} else if(firstPointDistance == secondPointDistance) {
				System.out.println("Points have equal distance");
			}
			return this;
		}
	}
}
