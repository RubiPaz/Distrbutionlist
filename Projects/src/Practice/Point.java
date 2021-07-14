package Practice;

 class Point {
		// encapsulation
		
		private double x;
		private double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public Point() {
			this(0, 0);
		}

		public Point(Point other) {
			this(other.x, other.y);
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		public double dist(Point other) {
			double dx = this.x - other.x;
			double dy = this.y - other.y;
			return Math.sqrt(dx * dx + dy * dy);
		}

		public double dist() {
			return dist(new Point());
		}

		public String toString() {

			return "(" + x + ", " + y + ")";
		}

		public boolean equals(Object obj) {

			if (!(obj instanceof Point)) {
				return false;
			}

			Point other = (Point) obj;

			return this.x == other.x && this.y == other.y;
		}

}
