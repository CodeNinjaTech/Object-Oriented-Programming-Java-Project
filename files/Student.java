/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author leftq
 */
public class Student extends Person {
    
    // Ιδιότητες
    private String program;
    private int entryYear;
    private int currentYear;
    
    // Κατασκευαστής
    public Student(int idNumber, String firstName, String lastName, String program, int entryYear, int currentYear) {
        super(idNumber, firstName, lastName);
        this.program = program;
        if ((entryYear >= 2000) && (entryYear <= 2050)) 
            this.entryYear = entryYear;
        else {this.entryYear = 2000;}
        if ((currentYear>=1) && (currentYear <= 6))
            this.currentYear = currentYear;
        else {this.currentYear = 1;}
    }

    // Getters - Setters για όλες τις ιδιότητες
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        if ((entryYear >= 2000) && (entryYear <= 2050))
            this.entryYear = entryYear;
        else {this.entryYear = 2000;}
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        if ((currentYear>=1) && (currentYear <= 6))        
            this.currentYear = currentYear;
        else {this.currentYear = 1;}
    }
    
    // Μέθοδοι
    public String getStatus() {
        return super.getName() + " " + this.getProgram() + " " + this.getEntryYear() + " " + this.getCurrentYear();
    }

    @Override
    public String toString() {
        return "Student{" + super.toString().substring(8, super.toString().lastIndexOf("\n}")) + "\n     Program: " + program + "\n     Entry Year: " + entryYear + "\n     Current Year: " + currentYear + "\n}";
    }

}
