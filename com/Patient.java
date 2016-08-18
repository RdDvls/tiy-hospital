


public class Patient extends Person {
    private boolean isSick = true;

    private boolean isSick(){
        return isSick;
    }
    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
