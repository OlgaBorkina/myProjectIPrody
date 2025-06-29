package factory;

public class Employee {

    String surname;
    String  name;
    String patronymic;
    String  position;
    String email;
    String numberPhone;
    Integer age;

    public Employee(String surname, String name, String patronymic,
                    String position, String email, String numberPhone, Integer age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.age = age;
    }

}
