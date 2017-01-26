package objects;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Student {
    // Variables
    private int numberInGroup;
    private String firstName, secondName;
    private SimpleDateFormat dateOfBirth = new SimpleDateFormat("dd.MM.yyyy");
    protected double medialScore;
    private Hometask[] arrayOfHometasks;
    private int[] hometasksScores = new int[3];

    // Constructor
    public Student(int numberInGroup, String firstName, String secondName, SimpleDateFormat dateOfBirth, Hometask[] arrayOfHometasks, int[] hometasksScores) {
        this.numberInGroup = numberInGroup;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.arrayOfHometasks = arrayOfHometasks;
        this.hometasksScores = hometasksScores;
    }


    // Getters
    public int getNumberInGroup() {
        return numberInGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    public int[] getHometasksScores() { return hometasksScores; }

    // Setters
    public void setNumberInGroup(int numberInGroup) {
        this.numberInGroup = numberInGroup;
    }

    private void setMedialScore(double medialScore) {
        this.medialScore = medialScore;
    }



    public String myToString(){
        String out;
        System.out.println();
        out = numberInGroup + ") " + firstName + " " + secondName + "; " + dateOfBirth.format(Calendar.getInstance().getTime()) + ";";
        return out;
    }







}
