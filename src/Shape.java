abstract class Shape {
    abstract void calculateArea();
    public static void main(String[] args){
        Circle c1=new Circle(3.5);
        c1.calculateArea();
        Rectangle r1=new Rectangle(2.35,5.3);
        r1.calculateArea();

    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius *radius;
        System.out.println("area is : "+area);
    }

}
class Rectangle extends Shape{
    double base;
    double height;
    public Rectangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    @Override
    void calculateArea() {
        double area= base * height;
        System.out.println("the area is : " + area);
    }
}

