
import java.util.Date;

public class OutPatient extends Patient{
    private double examinationFee, testingFee;

    public OutPatient(String code, String fullName, Date hospitalDate, boolean gender, double medicineCost, double examinationFee, double testingFee) {
        super(code, fullName, hospitalDate, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    public double getTestingFee() {
        return testingFee;
    }

    public void setTestingFee(double testingFee) {
        this.testingFee = testingFee;
    }
    
    @Override
    public double medicineFee() {
        return medicineCost;
    }

    @Override
    public double hospitalFee() {
        return examinationFee + testingFee + medicineFee();
    }
    
    @Override
    public String toString() {
        return "OutPatient{" + super.toString() + ", examinationFee=" + examinationFee + ", testingFee=" + testingFee + ", hospitalFee: " +this.hospitalFee() +'}';
    }
}
