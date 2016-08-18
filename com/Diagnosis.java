/**
 * Created by RdDvls on 8/17/16.
 */
public class Diagnosis {
    public static final int LUNG_CANCER = 1;
    public static final int BRAIN_CANCER = 2;
    public static final int COMMON_COLD = 3;
    public static final int SORE_THROAT = 4;
    public static final int UNDIAGNOSED = 5;
    public static final int TORN_ACL = 6;
    private int illness = UNDIAGNOSED;
    public Diagnosis(int illness){
        this.illness = illness;
    }
}
