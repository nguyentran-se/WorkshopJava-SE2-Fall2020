
import java.util.Date;

public class Manager extends Employee {

    private String position;
    private double positionAllowance;
    public static double yearReward = 100000;

    public Manager(String position, double positionAllowance, String employeeID,
             String fullName, double salaryCoefficient, Date workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCoefficient, workStartDate, gender);
        this.position = position;
        this.positionAllowance = positionAllowance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public String toString() {
        return "Manager{" + "position=" + position + ", positionAllowance="
                + positionAllowance + ", " + super.toString() + '}';
    }

    @Override
    public double reward() {
        return yearReward * numberOfYear();
    }

    @Override
    public double salary() {
        double salary = salaryCoefficient * basicSalary + seniorityAllowance() + positionAllowance;
        return salary;
    }

}
