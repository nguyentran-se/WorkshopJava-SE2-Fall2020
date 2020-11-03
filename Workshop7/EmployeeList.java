
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>();

    public ArrayList<Employee> getList() {
        return list;
    }

    public Employee getEmployee(int i) {
        return list.get(i);
    }

    public void addEmployees(Employee e) {
        list.add(e);
    }

    public ArrayList<Employee> managerList() {
        ArrayList<Employee> managerList = new ArrayList<>();
        for (Employee employee : list) {
            if (employee instanceof Manager) {
                managerList.add(employee);
            }
        }
        return managerList;
    }

    public double technicalSalaryAverage() {
        double sum = 0;
        int count = 0;
        for (Employee employee : list) {
            if (employee instanceof Technician) {
                sum += ((Technician) employee).salary();
                count++;
            }
        }
        return sum / count;
    }

    public Employee searchID(String id) {
        id = id.toUpperCase();
        for (Employee employee : list) {
            if (employee.getEmployeeID().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Employee> searchName(String name) {
        name = name.toUpperCase();
        ArrayList<Employee> listName = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getFullName().equals(name)) {
                listName.add(employee);
            }
        }
        return listName;
    }
    
    public ArrayList<Employee> searchGender(boolean gender) {
        ArrayList<Employee> listGender = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.isGender() == gender) {
                listGender.add(employee);
            }
        }
        return listGender;
    }
    
    public ArrayList<Employee> searchDate(Date date) {
        ArrayList<Employee> listDate = new ArrayList<>();
        for (Employee employee : list) {
            if (date.compareTo(employee.getWorkStartDate()) <= 0) {
                listDate.add(employee);
            }
        }
        return listDate;
    }
    
    public void removeID(String id){
        id = id.toUpperCase();
        for (Employee employee : list) {
            if(employee.getEmployeeID().equals(id)){
                list.remove(employee);
                break;
            }
            
        }
    }
    
    public void removeDate(Date date){
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getWorkStartDate().compareTo(date) > 0){
                list.remove(i);
            }
        }
    }
    
    public Employee lastSalaryMax(){
        double max = 0;
        int temp = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).salary() >= max) {
                max = list.get(i).salary();
                temp = i;
            }
        }
        return list.get(temp);
    }
    
    public void updateEmployee() throws ParseException{
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        String id = sc.nextLine();
        id = id.toUpperCase();
        Employee employee = searchID(id);
        while(employee == null){
            System.out.print("Not found, enter ID again: ");
            id = sc.nextLine();
            employee = searchID(id);
        }
        System.out.print("Change ID, -1 if you don't want to change: ");
        String temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) employee.setEmployeeID(temp);
        System.out.print("Change full name, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) employee.setFullName(temp);
        System.out.print("Change salary coefficient, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) employee.setSalaryCoefficient(Float.parseFloat(temp));
        System.out.print("Change work start date, yyyy/m/d, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) employee.setWorkStartDate(df.parse(temp));
        System.out.print("Change gender, true/false, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) employee.setGender(Boolean.parseBoolean(temp));
    }

}
