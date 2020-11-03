
import java.util.Date;

public class Technician extends Employee {

    private String work;
    public static double yearReward = 50000;

    public Technician(String work, String employeeID, String fullName,
            double salaryCoefficient, Date workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCoefficient, workStartDate, gender);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Technician{" + super.toString() + ", work=" + work + '}';
    }

    @Override
    public double reward() {
        return yearReward * numberOfYear();
    }

    @Override
    public double salary() {
        double salary = salaryCoefficient * basicSalary + seniorityAllowance();
        return salary;
    }

}
