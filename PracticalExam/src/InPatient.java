
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InPatient extends Patient{
    private double  dailyFee;
    private Date dischargeDate;

    public InPatient(String code, String fullName, Date hospitalDate, boolean gender, double medicineCost, double dailyFee, Date dischargeDate) {
        super(code, fullName, hospitalDate, gender, medicineCost);
        this.dailyFee = dailyFee;
        this.dischargeDate = dischargeDate;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public long numberOfDates(){
        return (this.dischargeDate.getTime()- this.hospitalDate.getTime())/1000/60/60/24;
    }
    
    @Override
    public double medicineFee() {
        return medicineCost * numberOfDates();
    }

    @Override
    public double hospitalFee() {
        return dailyFee * numberOfDates() + medicineFee();
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        return "InPatient{" + super.toString() + ", dailyFee=" + dailyFee + ", dischargeDate=" + df.format(dischargeDate) + '}';
    }
    
    
}
