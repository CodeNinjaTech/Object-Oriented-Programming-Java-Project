# Class Creation and Inheritance - Object Oriented Programming Java Project

Project for the Java Course of the Department of Programmers-Analysts of the School of Computer Programmers of the Hellenic Armed Forces

## Description

Create a class named `Person` that has the following properties encapsulated:
- `idNumber`
- `firstName`
- `lastName`
- `address`
- `mobile`

Create a constructor that accepts only the first 3 properties. Also, have for all properties the corresponding getters and setters and in addition the following methods:
- `getName` where it returns the first and last name of Person together separated by a space
- `toString` which displays the Person's data as follows:
```
Person {
ID Number: ...
First Name: ...
Last Name: ....
Address: ....
Mobile: ...
}
```

Then create a subclass named `Student` that has the following properties encapsulated:
- `program`
- `entryYear`
- `currentYear`

The variable `entryYear` should only take integer values between the years 2000 and 2050.
The variable `currentYear` shall only take values between 1 and 6.

Build a constructor that accepts only the first 3 properties of Person and the first 3 properties of Student. Have also for all properties, the corresponding getters and setters and in addition the following methods:
- `getStatus` where it returns the student's name, program, entryYear, and currentYear
- `toString` which displays all the Student's details using also the toString of Person

Then create a subclass named `Staff` that has the following properties encapsulated:
- `school`
- `salary`

The variable `salary` should only take floating-point values between 0 and 10000.

Build a constructor which accepts only the first 3 properties of Person and the first 2 properties of Staff. It should also have for all properties, the corresponding getters and setters and in addition the following methods:
- `toString` which displays all elements of Staff using both toString of Person

Finally, build a program (main) in which the classes Student and Staff are used. That is, create two objects, a Student and a Staff and call the `toString()` methods for each object.
