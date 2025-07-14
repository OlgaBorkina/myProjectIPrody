package entity;

public class Employee {
    String surname;
    String  name;
    String patronymic;
    String  position;
    String email;
    String numberPhone;
    Integer age;
    Double salary;

    public Employee(String surname,String name, String patronymic, String position, String email, String numberPhone, Integer age, Double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.age = age;
        this.salary = salary;
    }


    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
