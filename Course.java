/**
 * TODO: Complete the solution for Course
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Course {
    HashSet<Student> enrolled;
    private final int capacity;
    private final String department;
    private final String number;
    private final String description;

    public Course(String department, String number, String description, 
        int capacity) throws IllegalArgumentException {
            this.enrolled = new HashSet<Student>(0);
            this.capacity = capacity;
            this.department = department;
            this.number = number;
            this.description = description;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getNumber(){
        return this.number;
    }

    public String getDescription(){
        return this.description;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean enroll(Student student) throws IllegalArgumentException {
        if(student == null) {
            throw new IllegalArgumentException();
        }
        else if(this.enrolled.size() < this.capacity && this.enrolled.contains(student)) {
            this.enrolled.add(student);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean unenroll(Student student) throws IllegalArgumentException {
        if(student == null) {
            throw new IllegalArgumentException();
        }
        else if(this.enrolled.contains(student)) {
            this.enrolled.remove(student);
            return true;
        }
        else {
            return false;
        }
    }

    public void cancel() {
        this.enrolled.clear();
    }

    public boolean isFull() {
        if(this.enrolled.size() == this.getCapacity) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getEnrolledCount() {
        return this.enrolled.size();
    }

    public int getAvailableSeats() {
        return this.getCapacity - this.enrolled.size();
    }

    public HashSet<Student> getStudents() {
        return this.enrolled;
    }

    public ArrayList<Student> getRoster() {
        ArrayList<Student> roster = new ArrayList<Student>
        Iterator<Student> enrolledIterator = this.enrolled.iterator();
        while(roster.size() < enrolled.size()) {
            roster.add(enrolledIterator.next());
        }
        Collections.sort(roster);
        return roster;
    }

    public String toString() {
        String rep = this.getDepartment + " " + this.getNumber 
            + " [" + this.getCapacity + "]" 
            + "\n" + this.getDescription;
        return rep;
    }
}

