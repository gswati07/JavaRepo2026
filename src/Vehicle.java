public class Vehicle {
    private String brand;
    private double price;
    private int year;
    void start()
    {
        System.out.println("vehicle started");
    }
    public Vehicle(String brand,int year,double price){
        this.brand=brand;
        this.year=year;
        this.price=price;
    }
    public void displaydetails(){
        System.out.println("brand " + brand);
        System.out.println("price " + price );
        System.out.println("year " + year);
    }
}
class car extends Vehicle{
    public car(String brand, int year, double price) {
        super(brand, year, price);
    }

    void start(){
        super.displaydetails();
        System.out.println("Car has been started");
    }
    public static void main(String[] args){
        Vehicle v1=new Vehicle("hyundai" ,2021,125225.60);
        v1.start();
        v1.displaydetails();
        car c1=new car("kia" ,2022,155225.60);
        c1.start();
    }
}
