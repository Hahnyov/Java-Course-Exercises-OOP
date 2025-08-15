package Lectures.L01WorkingWithAbstractions.PoinInRectangle_02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int bottomLeftX=Integer.parseInt(input.split(" ")[0]);
        int bottomLeftY=Integer.parseInt(input.split(" ")[1]);
        int topRightX=Integer.parseInt(input.split(" ")[2]);
        int topRightY=Integer.parseInt(input.split(" ")[3]);

        Rectangle rectangle=new Rectangle(new Point(bottomLeftX,bottomLeftY),new Point(topRightX,topRightY));
        int n = Integer.parseInt(scanner.nextLine());
        List<Point> points=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);
            Point point = new Point(x, y);
            points.add(point);

        }
        for(Point point:points){
            System.out.println(rectangle.contains(point));
        }
    }
}
