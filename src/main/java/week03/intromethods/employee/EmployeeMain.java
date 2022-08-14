package week03.intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
    Employee employee = new Employee("Kocács Dezső",2012,500000);

    employee.salaryRaise(50000);

        System.out.println(employee.toString());

    }



}
