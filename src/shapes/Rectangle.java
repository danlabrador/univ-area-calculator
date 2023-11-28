package shapes;

public class Rectangle extends Shape{
  private double length;
  private double width;

  public Rectangle(String color, int length, int width) {
    super(color);
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }
  
  public double getLength(){
      return this.length;
  }
  
  public void setLength(double length){
      this.length = length;
  }
  
  public double getWidth(){
      return this.width;
  }
  
  public void setWidth(double width){
      this.width = width;
  }

  @Override public String toString() {
    return "Rectangle [color=" + this.getColor() +", length=" + length + ", width=" + width +"]";
  }
}
