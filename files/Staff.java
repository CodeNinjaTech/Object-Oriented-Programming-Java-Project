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
public class Staff extends Person {
    
    // Ιδιότητες
    private String school;
    private double salary;
    
    // Κατασκευαστής
    public Staff(int idNumber, String firstName, String lastName, String school, double salary) {
        super(idNumber, firstName, lastName);
        this.school = school;
        if ((salary <= 0) || (salary > 10000)) {
            this.salary = 0;
        } else {
            this.salary = (double)Math.round(salary * 100d) / 100d;
        }
    }
    
    // Getters - Setters

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if ((salary <= 0) || (salary > 10000)) {
            this.salary = 0;
        } else {
            this.salary = (double)Math.round(salary * 100d) / 100d;
        }
    }
    
    // Μέθοδοι
    @Override
    public String toString() {
        return "Staff{" + super.toString().substring(8, super.toString().lastIndexOf("\n}")) + "\n     School: " + school + "\n     Salary: " + salary + "\n}";
    }
    
}
