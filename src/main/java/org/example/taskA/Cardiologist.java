package org.example.taskA;

public class Cardiologist extends Doctor {
    private String treatmentFocus;
    private int surgeriesPerformed;


    public Cardiologist(){

    }

    public Cardiologist(String name, int age, String gender, String contactNumber, String specialty, int experience, String treatmentFocus, int surgeriesPerformed )
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.specialty = specialty;
        this.experience = experience;
        this.surgeriesPerformed = surgeriesPerformed;
        this.treatmentFocus =treatmentFocus;
    }

    public String getTreatmentFocus() {
        return treatmentFocus;
    }

    public void setTreatmentFocus(String treatmentFocus) {
        this.treatmentFocus = treatmentFocus;
    }

    public int getSurgeriesPerformed() {
        return surgeriesPerformed;
    }

    public void setSurgeriesPerformed(int surgeriesPerformed) {
        this.surgeriesPerformed = surgeriesPerformed;
    }


    @Override
    public String toString() {
        return "Cardiologist{" +
                "treatmentFocus='" + treatmentFocus + '\'' +
                ", surgeriesPerformed=" + surgeriesPerformed +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience=" + experience +
                '}';
    }
}
