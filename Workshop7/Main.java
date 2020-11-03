
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        EmployeeList employeeList = new EmployeeList();
        //khởi tạo nhân viên. 
        Manager manager1 = new Manager("CEO", 10000, "MNG100", "TRAN HUNG PHUC NGUYEN", 2, df.parse("2015/6/1"), true);
        Manager manager2 = new Manager("DIRECTOR", 7000, "MNG101", "DANG HONG NHUNG", 2, df.parse("2018/10/1"), false);
        Technician technician1 = new Technician("Help desk", "TNC100", "JUSTIN NGUYEN", 1, df.parse("2019/7/3"), true);
        Technician technician2 = new Technician("ReactDev", "TNC101", "TRAN JOHN", 1, df.parse("2017/7/3"), true);
        Technician technician3 = new Technician("JavaDev", "TNC102", "TRAN JOHN", 1, df.parse("2020/7/15"), false);
        //Thêm nhân viên vào list
        employeeList.addEmployees(manager1);
        employeeList.addEmployees(manager2);
        employeeList.addEmployees(technician1);
        employeeList.addEmployees(technician2);
        employeeList.addEmployees(technician3);
        System.out.println("---Get list:");
        for (Employee employee : employeeList.getList()) {
            System.out.println(employee);
        }
//        System.out.println(employeeList.getEmployee(2)); //Test method getEmployee();
        System.out.println("---Manager List: ");
        ArrayList<Employee> mngList = employeeList.managerList();
        for (Employee employee : mngList) {
            System.out.println(employee);
        }
        //average salary
        System.out.println("---Average salary of Technician: " + employeeList.technicalSalaryAverage());
        //search id
        System.out.print("---Enter ID to search: ");
        String id = sc.nextLine();
        System.out.println(employeeList.searchID(id));
        //search name
        System.out.print("---Enter name to search: ");
        String name = sc.nextLine();
        if (employeeList.searchName(name).size() == 0) {
            System.out.println("Not found");
        } else {
            for (Employee employee : employeeList.searchName(name)) {
                System.out.println(employee);
            }
        }
        //search gender
        System.out.print("---Enter gender to search, true/false: ");
        boolean gender = sc.nextBoolean();
        for (Employee employee : employeeList.searchGender(gender)) {
            System.out.println(employee);
        }
        //search date
        System.out.print("---Enter date to search, (yyyy/m/d): ");
        sc.nextLine();
        String d = sc.nextLine();
        for (Employee employee : employeeList.searchDate(df.parse(d))) {
            System.out.println(employee);
        }
        //remove by id
        System.out.print("---Enter ID to remove: ");
        id = sc.nextLine();
        employeeList.removeID(id);
        System.out.println("");
        System.out.println("---Get list at this time:");
        for (Employee employee : employeeList.getList()) {
            System.out.println(employee);
        }
        //remove by date
        System.out.print("---Enter date to remove, (yyyy/m/d): ");
        d = sc.nextLine();
        employeeList.removeDate(df.parse(d));
        System.out.println("");
        System.out.println("---Get list at this time:");
        for (Employee employee : employeeList.getList()) {
            System.out.println(employee);
        }
        //last person has max salary
        System.out.println("---The last person has max salary: ");
        System.out.println("Name: " + employeeList.lastSalaryMax().getFullName());
        System.out.println("Salary: " + employeeList.lastSalaryMax().salary());
        //update employee
        System.out.println("---Update employee:");
        System.out.print("Enter ID the one you want to change: ");
        employeeList.updateEmployee();
        System.out.println("Update successfully!");
        System.out.println("");
        System.out.println("---Get list after change:");
        for (Employee employee : employeeList.getList()) {
            System.out.println(employee);
        }
        System.out.println("");
        System.out.println("END - Made by Tran Hung Phuc Nguyen - Have a nice day!");
    }
}
