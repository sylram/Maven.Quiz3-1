package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Map<Lab,LabStatus> labs1;
    List<Lab> labs;

    public Student() {
        this.labs1 = new HashMap<>();
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();

    }

    public Lab getLab(String labName) {
        Lab findLab = null;
        for (Lab l : labs1.keySet()) {
            if (l.getName().equals(labName)) {
                findLab = l;
            }
            break;

        }return findLab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (labs1.containsKey(getLab(labName))) {
            labs1.put(getLab(labName), labStatus);
        } else {
            throw new UnsupportedOperationException();
        }
    }
    public void forkLab(Lab lab) {
        labs1.put(lab,LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {

        return labs1.get(getLab(labName));
    }

    @Override
    public String toString() {
        return "Student{" +
                "labs1=" + labs1 +
                '}';
    }
}
