package Day5.Task2;

import Day5.Task2.Contractor;
import Day5.Task2.Employee;
import Dzien4.User;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Aneta", "aneta@.wp.pl",1);
        Contractor contractor = new Contractor("Adam", "adam@company.pl", "SDA");

        User employeeUser = new Employee("Anna", "anna@wp.pl", 0.5f);
        User contractorUser = new Contractor("Jan", "janek@op.pl", "JAN");

        List <User> users = new ArrayList <>();

        users.add(employee);
        users.add(contractor);
        users.add(employeeUser);
        users.add(contractorUser);

        System.out.println(users); // ze względu na to, że nie mamy  toString, jeśli w nawiasie będzie users, poda nam ścieżkę
//        for (User:users){
//            System.out.println(users);
        }

    }

