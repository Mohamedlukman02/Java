package com.java.basic;

public class HospitalPatientRecord {
    public static void main(String[] args) {

        byte patientAge = 67;
        double weight = 68.75;
        char bloodGroupInitial = 'O';
        boolean icuAdmissionStatus = false;
        byte numberOfMedicines = 12;

        System.out.println("Hospital Patient Record");
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Group Initial: " + bloodGroupInitial);
        System.out.println("ICU Admission Status: " + icuAdmissionStatus);
        System.out.println("Number of Medicines Prescribed: " + numberOfMedicines);
    }
}