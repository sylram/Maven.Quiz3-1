package rocks.zipcode.io.quiz3.collections;

import java.util.HashMap;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    HashMap<Lab, LabStatus> labContainer;

    String labName;
    public Lab() {
        this.labContainer = new HashMap<>();
    }

    public Lab(String labName) {
        this.labName = labName;

    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        if(labStatus.equals(LabStatus.PENDING)){
            labContainer.put(this,labStatus);
        }else {
            throw new UnsupportedOperationException();
        }
    }

    public LabStatus getStatus() {
//        LabStatus.PENDING;
        return LabStatus.valueOf(this.labName);
    }
}
