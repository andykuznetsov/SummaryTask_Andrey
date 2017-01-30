package workers;

import objects.Group;
import objects.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class WorkerWithStudents {


    //List<Student> students = new ArrayList<Student>();

    /*
    public List<Student> getSuccessfullStudents(List<Student> students, Group group, double minScore){

        for (int i=0; i<group.getArrayOfStudents().length; i++){
            if (getStudentsMedialScore(group.getArrayOfStudents()[i]) > minScore){
                students.add(group.getArrayOfStudents()[i]);
            }
        }
        return students;
    }
    */


    public Student[] getSuccessfullStudents(Student[] students, Group group, int index, double minScore){

            if (getStudentsMedialScore(group.getArrayOfStudents()[index]) > minScore) {
                Arrays.copyOf(students, students.length + 1);
                students[students.length - 1] = group.getArrayOfStudents()[index];
            }

            getSuccessfullStudents(students, group, index+1, minScore);

        return students;
    }

    public double getStudentsMedialScore(Student student) {
        int sum = 0;
        for (int i : student.getHometasksScores()
                ) {
            sum = sum + i;
        }
        double medialScore = sum / student.getHometasksScores().length;
        return medialScore;
    }

    public double getGroupsMedialScore(Group group){
        double sum = 0;
        for (int i = 0; i < group.getArrayOfStudents().length; i++) {
            sum = sum + getStudentsMedialScore(group.getArrayOfStudents()[i]);
        }
        double medialScore;
        medialScore = sum / group.getArrayOfStudents().length;
        return medialScore;
    }

/*
    public Student getWinnerAndOutsider(Group group){
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 1; i < group.getArrayOfStudents().length; i++){
           // if ()
        }

    }
*/


}
