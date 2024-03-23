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
public class Person {

    // Ιδιότητες
    private int idNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String mobile;

    // Κατασκευαστής
    public Person(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters - Setters για όλες τις ιδιότητες
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    // Μέθοδοι
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Person {\n" + "     ID Number: " + idNumber + "\n     First Name: " + firstName + "\n     Last Name: " + lastName + "\n     Address: " + address + "\n     Mobile: " + mobile + "\n}";
    }
    
}
