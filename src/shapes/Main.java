package shapes;

public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape("red");
    Shape rectangle = new Rectangle("blue", 10, 20);
    Shape triangle = new Triangle("green", 10, 20);

    System.out.println(shape.toString());
    getArea(shape);
    System.out.println();

    System.out.println(rectangle.toString());
    getArea(rectangle);
    System.out.println();

    System.out.println(triangle.toString());
    getArea(triangle);
    
  }

  public static void getArea(Shape shape){
    if (shape instanceof Rectangle) {
      Rectangle rectangle = (Rectangle) shape;
      System.out.println("Rectangle area: " + rectangle.getArea());
    } else if (shape instanceof Triangle) {
      Triangle triangle = (Triangle) shape;
      System.out.printf("Triangle area: %.2f", triangle.getArea());
    } else {
      System.out.println("Unknown shape");
    }
  }

}
