class Teacher extends Person {
    private String school;
    private String subject;
    private int students;

    // Constructor
    public Teacher(String name, String school, String subject, int students) {
        super(name); // Initialize name from Person class
        this.school = school; // Initialize school specific to Teacher
        this.subject = subject; // Initialize subject they teach
        this.students = students;
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(getName() + " teaches " + subject + " at " + school);
        System.out.println(getName() + " has " + students + " students");
    }
}