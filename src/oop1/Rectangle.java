package oop1;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;


    int calculateArea(int width, int height) {
        area = width * height;
        System.out.println("넓이: " + area);
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
        return 2 * (width +  height);
    }

    boolean isSquare(int width, int height) {
        square = width == height;
        System.out.println("정사각형 여부: " + square);
        return width == height;
    }
}
