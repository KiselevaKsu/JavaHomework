class Rectangle {
    protected int width;
    protected int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    
    public Square(int side) {
        super(side, side);
    }
    
    // НЕ нарушаем принцип Лисков - поведение метода calculateArea() остается корректным
}

public class Liskov {

    public static void printArea(Rectangle shape) {
        System.out.println("Площадь фигуры: " + shape.calculateArea());
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);

        Rectangle square = new Square(5);

        System.out.println("Прямоугольник 5x4:");
        printArea(rectangle); // 20
        
        System.out.println("Квадрат 5x5:");
        printArea(square);    // 25
        
        // принцип Лисков соблюден: квадрат успешно заменяет прямоугольник
    }
}