public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Elizabeth", " Balayan Batangas PH", "BSIT", 2);
        System.out.println(student.toString());

        System.out.println("\n----------------------------------\n");

        // Create a Staff object
        Staff staff = new Staff("Cresmarie", "Manila PH", "IT");
        System.out.println(staff.toString());
    }
}
