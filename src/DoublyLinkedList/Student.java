/**
 * Created by Asseel Tarishon 9/02/2022.
 */
public class Student {
    int id;
    String mname;
    String major;

    public Student(int id, String mname, String major) {
        this.id = id;
        this.mname = mname;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
