import java.util.Objects;

public class Teacher extends Person {

    private String dept;
    private String[] subjects;

    public Teacher(String name, String surname, String sex,
                   String dept, String[] subjects) {
        super(name, surname, sex);
        this.dept = dept;
        this.subjects = subjects;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }


    @Override
    public String toString() {
        return super.toString() +
               ", Teacher{department='" + dept + "', courses=" +
               java.util.Arrays.toString(subjects) + "}";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t) &&
               Objects.equals(dept, t.dept) &&
               java.util.Arrays.equals(subjects, t.subjects);
    }
}