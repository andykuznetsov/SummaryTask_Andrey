package objects;


import workers.WorkerWithStudents;

import java.text.SimpleDateFormat;


public class Demo {
    public static void main(String[] args) {


        Hometask hometask1 = new Hometask("DataBases", 1, "DataBases Basics", "SomeBigTextttttt");
        Hometask hometask2 = new Hometask("DataBases2", 2, "DataBases Basics2", "SomeBigTextttttt2");
        Hometask hometask3 = new Hometask("DataBases3", 3, "DataBases Basics3", "SomeBigTextttttt3");

        Hometask[] myArrayOfHometasks = {hometask1, hometask2, hometask3};

        int[] myHometsksScores1 =  {1, 3, 5};
        int[] myHometsksScores2 =  {3, 4, 5};
        int[] myHometsksScores3 =  {5, 3, 1};
        int[] myHometsksScores4 =  {5, 5, 2};


        SimpleDateFormat firstDate = new SimpleDateFormat("01.01.1990");
        SimpleDateFormat secondDate = new SimpleDateFormat("05.05.1995");
        SimpleDateFormat thirdDate = new SimpleDateFormat("09.09.1996");
        SimpleDateFormat fourthDate = new SimpleDateFormat("05.10.1994");

        Student student1 = new Student(1, "Ivan", "Ivanov", firstDate,  myArrayOfHometasks, myHometsksScores1);
        Student student2 = new Student(2, "Petro", "Petrov", secondDate, myArrayOfHometasks, myHometsksScores2);
        Student student3 = new Student(3, "Olexandr", "Olexandrov", thirdDate, myArrayOfHometasks, myHometsksScores3);
        Student student4 = new Student(4, "Johny", "Sins", fourthDate, myArrayOfHometasks, myHometsksScores4);


        Student[] myArrayOfStudents = {student1, student2, student3, student4};


        WorkerWithStudents myWorker = new WorkerWithStudents();

        Group group1 = new Group(13, "CS", myArrayOfStudents);

        System.out.println(group1.myToString() + "; Medial score " + myWorker.getGroupsMedialScore(group1));

        for (int i =0; i<myArrayOfStudents.length; i++){
            System.out.println(myArrayOfStudents[i].myToString() + " Medial score: " + myWorker.getStudentsMedialScore(myArrayOfStudents[i]));
        }

        for (int i = 0; i<myArrayOfHometasks.length; i++){
            System.out.println(myArrayOfHometasks[i].myToString());
        }

        //List<Student> succesfullStudents = null;
        Student[] succesfullStudents = null;
        System.out.println(myWorker.getSuccessfullStudents(succesfullStudents, group1, 0, 3));
    }
}
