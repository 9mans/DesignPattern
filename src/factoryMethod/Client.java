package factoryMethod;

public class Client {
    public static void main(String[] args) {

        ShapeFactory circle = new CircleFactory();
        circle.render();

        ShapeFactory rectangle = new RectangleFactory();
        rectangle.render();
    }
}
