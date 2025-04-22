import java.io.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();
        int gradeSize = scanner.nextInt(); 
        for (int i=0; i<gradeSize; i++){
            grades.add(scanner.nextInt());
        }
        scanner.close();
        Student student = new Student(firstName, lastName, idNumber, grades);
        student.print();
        
    }
    
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    Person(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    
    public void print(){
        System.out.println("Name: " + this.lastName+ ", " + this.firstName);
        System.out.println("ID: " + this.idNumber);
    }
}

class Student extends Person{
    private List<Integer> grades = new ArrayList<>();
    
    Student(String firstName, String lastName, int idNumber, List<Integer> grades){
        super(firstName, lastName, idNumber);
        this.grades = grades;
    }
    
    public char getGrade (){
        float avg = this.grades.stream().mapToInt(v -> v).sum()/this.grades.size();
        if (90 <= avg && avg <= 100){
            return 'O';
        }
        else if (80 <= avg && avg < 90){
            return 'E';
        }
        else if (70 <= avg && avg < 80){
            return 'A';
        }
        else if (55 <= avg && avg < 70){
            return 'P';
        }
        else if (40 <= avg && avg < 55){
            return 'D';
        }
        else{
            return 'T';
        }
    }
    
    public void print(){
        super.print();
        System.out.println("Grade: " + this.getGrade());
    }
}