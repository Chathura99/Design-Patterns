package Behavioral.NullObject;
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class NullShape implements Shape {
    @Override
    public void draw() {
        // do nothing
    }
}

class ShapeFactory {
    public static Shape createShape(String type) {
        if (type == null) {
            return new NullShape();
        }
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return new NullShape();
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape(null);
        shape2.draw();
    }
}
