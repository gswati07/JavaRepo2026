class Students {
    private String name;
    private int roll_no;
    private int marks;

    // Constructor to initialize values
    public Students(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        // Create 3 student objects
        Students s1 = new Students("Shivani", 20, 559);
        Students s2 = new Students("Rahul", 21, 600);
        Students s3 = new Students("Priya", 22, 580);

        // Display details of all 3 students
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
