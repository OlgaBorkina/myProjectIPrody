package entity;

import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Random rand = new Random();
        Integer sampl = 40;

        Employee[] employees = new Employee[5];
        System.out.println("---All employees---");
        for (int i = 0; i < employees.length; i++) {
            Double sal = Math.round((1000 + rand.nextDouble() * (25000 - 1000)) * 100.0) / 100.0;

            employees[i] =  new Employee(faker.name().lastName(), faker.name().name(), faker.funnyName().name(),
                    faker.job().position(), faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(), 20 + rand.nextInt(55), sal);
            System.out.print("Employee number " + i + " -> " );
            employees[i].print();

        }
        System.out.println("---Employees after sampling---");
        for(int i=0;i<employees.length;i++) {
            if(employees[i].age>=sampl){
                System.out.print("Employee number " + i + " -> " );
                employees[i].print();
            }
        }



    }


}
