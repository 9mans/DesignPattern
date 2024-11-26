package factoryMethod;

abstract class ShapeFactory {

    // 팩토리 메서드 : 구체적인 생성 로직은 하위 클래스에서 구현
    abstract Shape createShape();

    // 공통 작업 : 팩토리 메서드를 활용
    public void render() {
        Shape shape = createShape();
        shape.draw();
    }
}
