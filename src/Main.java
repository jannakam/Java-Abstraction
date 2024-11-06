public class Main {
    public static void main(String[] args) {

        // testing
        Teacher teacher1 = new Teacher("Ali", "Boubyan Technology Academy", "Java & Spring Boot", 16);
        teacher1.describeRole();

        Teacher teacher2 = new Teacher("Andreas", "Boubyan Technology Academy", "Java & Spring Boot", 16);
        teacher2.describeRole();

        // Other classes for fun
        Artist artist1 = new Artist("Norman Rockwell", "Illustration");
        Employee employee1 = new Employee("Abdullah", "CODED");
        artist1.describeRole();
        employee1.describeRole();

    }
}