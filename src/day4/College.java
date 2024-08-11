package day4;

public class College {
	String collegeName;
    String location;

    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
    }
}

// Department class (Child class of College)
class Department extends College {
    String departmentName;

    Department(String collegeName, String location, String departmentName) {
        super(collegeName, location);
        this.departmentName = departmentName;
    }

    void displayDepartmentDetails() {
        displayCollegeDetails();
        System.out.println("Department Name: " + departmentName);
    }
}

// Strength class (Child class of Department)
class Strength extends Department {
    int studentStrength;

    Strength(String collegeName, String location, String departmentName, int studentStrength) {
        super(collegeName, location, departmentName);
        this.studentStrength = studentStrength;
    }

    void displayStrengthDetails() {
        displayDepartmentDetails();
        System.out.println("Student Strength: " + studentStrength);
    }
}

// Student class
class Student {
    String studentName;
    Strength strength;

    Student(String studentName, Strength strength) {
        this.studentName = studentName;
        this.strength = strength;
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        strength.displayStrengthDetails();
    }

}





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


