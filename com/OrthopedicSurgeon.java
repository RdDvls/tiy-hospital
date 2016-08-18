/**
 * Created by RdDvls on 8/18/16.
 */
public class OrthopedicSurgeon extends HospitalDoctor implements Surgeon {
    public OrthopedicSurgeon(String firstName, String lastName, String college){
        super(firstName, lastName, college);
    }

    public Diagnosis Diagnose(){
        return new Diagnosis(Diagnosis.TORN_ACL);
    }
    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
