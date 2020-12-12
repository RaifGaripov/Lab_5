package data;

import data.shapes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(6.6));
        shapes.add(new Square(7));
        shapes.add(new Rectangle(9.3, 3.3));
        shapes.add(new Triangle(5.2, 8.1, 6.9));

        FileSource<Shape> converter = new ShapeSource("shapes.json");
        try {
            converter.toFile(shapes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<Shape> shapesFromFile = converter.fromFile();
            shapesFromFile.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
