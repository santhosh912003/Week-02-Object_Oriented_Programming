import java.util.*;

class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 90));
        student.addSubject(new Subject("English", 78));

        GradeCalculator calculator = new GradeCalculator();
        calculator.computeGrade(student);
        student.displayStudentDetails();
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        for (Subject subject : subjects) {
            System.out.println("Subject: " + subject.getName() + ", Score: " + subject.getScore());
        }
    }
}

class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class GradeCalculator {
    public void computeGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        double totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        double average = totalScore / subjects.size();
        String grade = getGrade(average);
        System.out.println("Final Grade: " + grade);
    }

    private String getGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}
