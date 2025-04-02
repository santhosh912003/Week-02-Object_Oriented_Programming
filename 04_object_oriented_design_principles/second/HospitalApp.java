import java.util.*;

class HospitalApp {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Adams");

        Patient p1 = new Patient("John Doe");
        Patient p2 = new Patient("Jane Doe");

        doc1.consult(p1);
        doc1.consult(p2);
        doc2.consult(p1);

        doc1.displayPatients();
        doc2.displayPatients();
        p1.displayDoctors();
        p2.displayDoctors();
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println(name + " is consulting " + patient.getName());
    }

    public void displayPatients() {
        System.out.println(name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }

    public String getName() {
        return name;
    }
}
