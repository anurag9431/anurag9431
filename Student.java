    class Student {
    private String name;
    private int rollNumber;
    private String branch;

    public Student(String name, int rollNumber, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void branch() {
        System.out.println("Branch is " + branch);
    }

    public static void main(String[] args) {
        Student student = new Student("Anurag", 2230328, "ECSC");
        student.branch(); 
    }
}
public class Student {
    private String name;
    private int rollNumber;
    private String branch;

    public Student(String name, int rollNumber, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void branch() {
        System.out.println("Branch is " + branch);
    }

    public static void main(String[] args) {
        Student student = new Student("Adarsh", 2234567, "ECSC");
        student.branch(); 
    }
}
