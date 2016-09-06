package com.company;

public class Main {

    public static void main(String[] args) {
	Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "ivanow@company.com", "+885553636", 50000, 52 );
        emplArray[1] = new Employee("Petrov Petr Petrovich", "Accountant", "petrov@company.com", "+868435795", 30000, 43 );
        emplArray[2] = new Employee("Sidorov Sidor Sidorovich", "Manager", "sidorov@company.com", "+897465139", 20000, 32 );
        emplArray[3] = new Employee("Vodkin Fedor Fedorovich", "Driver", "vodkin@company.com", "+897541236", 18000, 40 );
        emplArray[4] = new Employee("Stukov Yriy Nefedovich", "Engineer", "stukov@company.com", "+836536598", 25000, 38 );

        for (int i = 0; i < emplArray.length; i++) {
            emplArray[i].printInfo();
        }
    }
}

class Employee {
    protected String name;
    protected String post;
    protected String email;
    protected String phoneNumber;
    protected int salary;
    static int age;

    public Employee (String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.println("Name: "+name+"\n"+"Post: "+post+"\n"+"E-mail: "+email+"\n"+"Phone: "
        +phoneNumber+"\n"+"Salary: "+salary+"\n"+"Age: "+age+"\n");
    }
}