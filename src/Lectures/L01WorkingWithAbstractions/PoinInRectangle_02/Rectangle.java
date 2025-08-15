package Lectures.L01WorkingWithAbstractions.PoinInRectangle_02;

import java.security.PrivateKey;

public class Rectangle {
    //полета -> създаваме различни обекти обекти от класа
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }
    //за всеки един правоъгълник да проверявам дали е в него точката

    public boolean contains(Point point) {
        return point.getX() >= this.bottomLeftPoint.getX() && point.getX() <= this.topRightPoint.getX()
                && point.getY() >= this.bottomLeftPoint.getY() && point.getY() <= this.topRightPoint.getY();
    }
}
