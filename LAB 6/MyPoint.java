public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point) {
        int xDiff = this.x - point.getX();
        int yDiff = this.y - point.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ThreeDPoint extends MyPoint {
    private int z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double distance(ThreeDPoint point) {
        int xDiff = this.getX() - point.getX();
        int yDiff = this.getY() - point.getY();
        int zDiff = this.z - point.getZ();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

    public int getZ() {
        return z;
    }
}

public class Main {
    public static void main(String[] args) {
        ThreeDPoint point1 = new ThreeDPoint();
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25);

        double distance = point1.distance(point2);
        System.out.println("Distance between the two points: " + distance);
    }
}