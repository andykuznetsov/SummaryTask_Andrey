package objects;

public class WorkerWithStudents {

    public double getStudentsMedialScore(Student student) {
        int sum = 0;
        for (int i : student.getHometasksScores()
                ) {
            sum = sum + student.getHometasksScores()[i];
        }
        double medialScore = sum / student.getHometasksScores().length;
        return medialScore;
    }



}
