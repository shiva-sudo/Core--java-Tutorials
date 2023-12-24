public class InstanceVariableExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //Before assiging vlues to employee object
        System.out.println("Employee id: " + employee.id);
        System.out.println("Employee name: " + employee.empName);
        System.out.println("Employee age: " + employee.age);

        System.out.println("=====================================");

        employee.id = 101;
        employee.empName = "John";
        employee.age = 23;

        //After assiging vlues to employee object
        System.out.println("Employee id: " + employee.id);
        System.out.println("Employee name: " + employee.empName);
        System.out.println("Employee age: " + employee.age);



    }
}
 class Employee {

    //Instance variables employee id
    int id;

    //Instance variables employee name
    String empName;

    //Instance variables employee age
    int age;

 }