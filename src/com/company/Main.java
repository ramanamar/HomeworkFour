package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Employee> eArr = new ArrayList<>();    //Создаем ArrayList и добавляем в него сотрудников
        eArr.add(new Employee("Ivanov Ivan Ivanovich", "Director", "ivanow@company.com", "+885553636", 50000, 52 ));
        eArr.add(new Employee("Petrov Petr Petrovich", "Accountant", "petrov@company.com", "+868435795", 30000, 43 ));
        eArr.add(new Employee("Sidorov Sidor Sidorovich", "Manager", "sidorov@company.com", "+897465139", 20000, 32 ));
        eArr.add(new Employee("Vodkin Fedor Fedorovich", "Driver", "vodkin@company.com", "+897541236", 18000, 40 ));
        eArr.add(new Employee("Stukov Yriy Nefedovich", "Engineer", "stukov@company.com", "+836536598", 25000, 38 ));

        for (Employee e: eArr) {    //Для каждого элемента из массива eArr получаем возраст через геттер и
            if (e.getAge() >= 40) { //сравниваем полученное значение с заданным
                e.printInfo();      //При совпадении, выводим элемент в консоль
            }
        }
    }
}

class Employee {    //Создаем класс сотрудников
    protected String name;
    protected String post;
    protected String email;
    protected String phoneNumber;
    protected int salary;
    protected int age;

    //Конструктор класса с параметрами, который заменяет конструктор по-умолчанию
    public Employee (String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {    //Геттер для получения возраста сотрудника. Сеттер нам здесь не нужен
        return age;
    }

    public void printInfo () {    //Метод вывода информации о сотруднике
        System.out.println("Name: "+name+"\n"+"Post: "+post+"\n"+"E-mail: "+email+"\n"+"Phone: "
        +phoneNumber+"\n"+"Salary: "+salary+"\n"+"Age: "+age+"\n");
    }
}