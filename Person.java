package program3;
public class Person {
    String name;
    String dob; // YYYY-MM-DD

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        String year = dob.substring(0, 4); // Extract year from YYYY-MM-DD
        int age = 2025 - Integer.parseInt(year); // Assuming current year is 2025
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: "+age);
}
}
