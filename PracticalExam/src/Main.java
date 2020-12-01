
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        OutPatient outPatient1 = new OutPatient("OP101", "JOHN", df.parse("2019/8/1"), true, 3000, 4000, 5000);
        OutPatient outPatient2 = new OutPatient("OP102", "SARA", df.parse("2018/6/2"), true, 6000, 7000, 8000);
        OutPatient outPatient3 = new OutPatient("OP103", "BUNNY", df.parse("2017/5/3"), true, 1000, 2000, 3000);
        InPatient inPatient1 = new InPatient("IP104", "MICHEAL", df.parse("2020/2/1"), true, 2000, 1000, df.parse("2020/10/1"));
        InPatient inPatient2 = new InPatient("IP105", "CARL", df.parse("2015/1/1"), true, 3000, 2000, df.parse("2016/10/1"));
        InPatient inPatient3 = new InPatient("IP106", "LIP", df.parse("2014/8/1"), true, 4000, 3000, df.parse("2014/10/1"));
        PatientList patientList = new PatientList();
        patientList.addPatient(outPatient1);
        patientList.addPatient(outPatient2);
        patientList.addPatient(outPatient3);
        patientList.addPatient(inPatient1);
        patientList.addPatient(inPatient2);
        patientList.addPatient(inPatient3);
        System.out.println("---Current list:");
        for (Patient patient : patientList.getListPatient()) {
            System.out.println(patient);
        }
        System.out.println("");
        System.out.println("---Average In Patient's hospital fee is: " + patientList.avgInHospitalFee());
        System.out.println("");
        System.out.println("---Out Patient list:");
        for (Patient patient : patientList.outPatientList()) {
            System.out.println(patient);
        }
        System.out.println("");
        System.out.println("---The last occurrence of the patient having minimum hospital’s fee: ");
        System.out.println(patientList.lastMinHospitalFee());
        System.out.println("");
        System.out.print("---Enter date to remove, (yyyy/m/d): ");
        String date = sc.nextLine();
        patientList.removeDate(df.parse(date));
        System.out.println("");
        System.out.println("---Current list after remove");
        for (Patient patient : patientList.getListPatient()) {
            System.out.println(patient);
        }
    }
}
