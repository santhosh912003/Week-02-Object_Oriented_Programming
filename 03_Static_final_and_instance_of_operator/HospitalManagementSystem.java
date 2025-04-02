import java.util.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Fever");
        Patient p2 = new Patient("Bob", 45, "Fracture");

        if (p1 instanceof Patient) p1.displayPatientDetails();
        if (p2 instanceof Patient) p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    private static int idCounter = 1;

    public Patient(String name, int age, String ailment) {
        this.patientID = idCounter++;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + 
                ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
    }
}
