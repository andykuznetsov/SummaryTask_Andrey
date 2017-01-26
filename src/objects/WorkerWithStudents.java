package objects;

public class WorkerWithStudents {

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
