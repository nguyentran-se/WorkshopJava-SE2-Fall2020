
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Patient implements IPatient{

    protected String code, fullName;
    protected Date hospitalDate;
    protected boolean gender;
    protected double medicineCost;

    public Patient(String code, String fullName, Date hospitalDate, boolean gender, double medicineCost) {
        this.code = code;
        this.fullName = fullName;
        this.hospitalDate = hospitalDate;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getHospitalDate() {
        return hospitalDate;
    }

    public void setHospitalDate(Date hospitalDate) {
        this.hospitalDate = hospitalDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }
    
    public abstract double medicineFee();
    
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        return "code=" + code + ", fullName=" + fullName + ", hospitalDate=" + df.format(hospitalDate) + ", gender=" + gender + ", medicineCost=" + medicineCost;
    }
}
