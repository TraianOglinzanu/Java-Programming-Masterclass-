package com.example.challenge;

/* Question 30 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return null;
        }else if(firstName.isEmpty()) {
            return lastName;
        }else if(lastName.isEmpty()) {
            return firstName;
        }else{
            return (firstName + ' ' + lastName);
        }
    }

    public boolean isTeen() {
        if(age > 12 && age < 20){
            return true;
        }else{
            return false;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if((age < 0) || (age > 100)){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
