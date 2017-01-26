package objects;


import java.util.Calendar;

public class Group {

    private int number;
    private String faculty;


    private Student[] arrayOfStudents;

    private int amount;


    public Group(int number, String faculty, Student[] arrayOfStudents) {
        this.number = number;
        this.faculty = faculty;
        this.arrayOfStudents = arrayOfStudents;
        this.amount = arrayOfStudents.length;
    }


    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public Student[] getArrayOfStudents() {
        return arrayOfStudents;
    }

    public int getAmount() {
        return amount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String myToString(){
        String out;
        System.out.println();
        out = "Group number: " + number + "; Faculty: " + faculty + "; Amount of students in group: " + amount;
        return out;
    }

}
