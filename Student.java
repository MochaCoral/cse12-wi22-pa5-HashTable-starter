/**
 * TODO: Complete the solution for Student
 */
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final String PID;

    public Student(String firstName, String lastName, String PID) throws IllegalArgumentException {
        if(firstName == null || lastName == null || PID == null) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.PID = PID

    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPID() {
        return this.PID;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student) { 
            if(this.getFirstName == o.getFirstName && this.getLastName == o.getLastName 
                && this.getPID == o.getPID) {
                return true;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstName, this.getLastName, this.getPID);
    }

    @Override
    public int compareTo(Student o) {
        if(this.getLastName =! o.getLastName) {
            return this.getLastName.compareTo(o.getLastName);
        }
        else if(this.getFirstName =! o.getFirstName) {
            return this.getFirstName.compareTo(o.getFirstName);
        }
        else if(this.getPID =! o.getPID) {
            return this.getPID.compareTo(o.getPID);
        }
        else {
            return 0;
        }
    }
}
