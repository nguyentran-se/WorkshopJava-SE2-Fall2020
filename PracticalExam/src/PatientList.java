
import java.util.ArrayList;
import java.util.Date;

public class PatientList {

    private ArrayList<Patient> listPatient = new ArrayList<>();

    public ArrayList<Patient> getListPatient() {
        return listPatient;
    }

    public void setListPatient(ArrayList<Patient> listPatient) {
        this.listPatient = listPatient;
    }

    public void addPatient(Patient p) {
        listPatient.add(p);
    }

    public double avgInHospitalFee() {
        double sumHospitalFee = 0;
        int count = 0;
        for (Patient patient : listPatient) {
            if (patient instanceof InPatient) {
                sumHospitalFee += ((InPatient) patient).hospitalFee();
                count++;
            }
        }
        return sumHospitalFee / count;
    }

    public ArrayList<Patient> outPatientList() {
        ArrayList<Patient> outPatientList = new ArrayList<>();
        for (Patient patient : listPatient) {
            if (patient instanceof OutPatient) {
                outPatientList.add(patient);
            }
        }
        return outPatientList;
    }

    public Patient lastMinHospitalFee() {
        double min = listPatient.get(0).hospitalFee();
        int temp = 0;
        for (int i = 1; i < listPatient.size(); i++) {
            if (listPatient.get(i).hospitalFee() <= min) {
                temp = i;
            }
        }
        return listPatient.get(temp);
    }

    public void removeDate(Date date) {
        for (int i = listPatient.size() - 1; i >= 0; i--) {
            if (listPatient.get(i) instanceof InPatient) {
                if (((InPatient) listPatient.get(i)).getDischargeDate().compareTo(date) >= 0) {
                    listPatient.remove(i);
                }
            }
        }
    }
    
}
