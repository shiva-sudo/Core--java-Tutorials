public class StaticVariableExample {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John");
        Student student2 = new Student(102, "Peter");
        Student student3 = new Student(103, "Mary");
        Student student4 = new Student(104, "Joseph");
        Student student5 = new Student(105, "Paul");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
     }
}

class Student{
    private int rollNo;
    private String name;
    private static String collegeName = "ABC College";

    //Constructor

    public Student(int rollNo, String name){
        super();
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", collegeName=" + collegeName + '}';
    }
}

    

