package org.example.taskA;

public class Surgeon extends Doctor {

    private String surgeryType;
    private int numberOfSurgeries;

    public Surgeon(){

    }


    public Surgeon(String name, int age, String gender, String contactNumber, String specialty, int experience, String surgeryType, int numberOfSurgeries )
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.specialty = specialty;
        this.experience = experience;
        this.numberOfSurgeries = numberOfSurgeries;
        this.surgeryType = surgeryType;
    }


    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public int getNumberOfSurgeries() {
        return numberOfSurgeries;
    }

    public void setNumberOfSurgeries(int numberOfSurgeries) {
        this.numberOfSurgeries = numberOfSurgeries;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "surgeryType='" + surgeryType + '\'' +
                ", numberOfSurgeries=" + numberOfSurgeries +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience=" + experience +
                '}';
    }
}
