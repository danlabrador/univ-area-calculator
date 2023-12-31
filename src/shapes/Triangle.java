package shapes;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }
  
  public double getArea(){
    return 0.5 * base * height;
  }
  
  public double getBase(){
      return this.base;
  }
  
  public void setBase(double base){
      this.base = base;
  }
  
  public double getHeight(){
      return this.height;
  }
  
  public void setHeight(double height){
      this.height = height;
  }

  @Override public String toString() {
    return "Triangle [color=" + this.getColor() +", base=" + base + ", height=" + height +"]";
  }
}
