public class Employee {
    private double salary;
    //Salary < 50k gets 15%, 50k-100k gets 10%, >100k gets 5%
    public Employee(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
    public double CalculateBonus(){
        double bonus;
        if(this.salary <= 50000){
            bonus= salary *(15.0 /100);
               }
        else if(this.salary > 50000 && this.salary <= 100000){
            bonus= salary *(10.0 /100);
        }
        else {
            bonus= this.salary *(5.0 /100);
               }
        return bonus;
    }
    public static void main(String[] args){
    Employee e1=new Employee(513000);
    Employee e2=new Employee(20333);
    double bonus1=e1.CalculateBonus();
    System.out.println("bonus  :" + bonus1);
    double bonus2=e2.CalculateBonus();
    System.out.println("bonus  :" + bonus2);
}
}
